package com.seerbit.demo.service;



import java.io.IOException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seerbit.demo.model.FCMBCashPickUp;
import com.seerbit.demo.model.TransactionStatus;
import com.seerbit.demo.payoutAPIService.PayoutAPICallService;
import com.seerbit.demo.repository.CommonResponseRepository;
import com.seerbit.demo.repository.FcmbCashPickUpRepository;
import com.seerbit.demo.repository.TransactionStatusRepository;
import com.seerbit.demo.response.CommonResponse;

import retrofit2.Call;

@Service
public class PayoutService {
	
	@Autowired
	private PayoutAPICallService payoutAPICallService;
	
	@Autowired
	private TransactionStatusRepository transactionStatusRepository;
	
	@Autowired
	private FcmbCashPickUpRepository fcmbCashPickUpRepository;
	
	@Autowired
	private CommonResponseRepository commonResponseRepository;
	
	public TransactionStatus checkTransactionStatus(String reference, String authenticationToekn) {
		
		TransactionStatus execute=null;
		try {
			Call<TransactionStatus> checkStatus = payoutAPICallService.checkStatus(authenticationToekn,reference);
			TransactionStatus transactionSatus = checkStatus.execute().body();
			TransactionStatus findByReference=null;
			if(transactionSatus.getTransaction().getReference() != null) {
				findByReference = transactionStatusRepository.findByReference(transactionSatus.getTransaction().getReference());
			}
			if(findByReference != null) {
				updateModelByLatestResponse(transactionSatus, findByReference); //update document if reference id is not unique
			}
			if(findByReference != null) {
				execute =  transactionStatusRepository.save(findByReference);
			}else {
				execute = transactionSatus;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		 return execute;
	}

	private void updateModelByLatestResponse(TransactionStatus transactionSatus, TransactionStatus findByReference) {
		findByReference.setCode(transactionSatus.getCode());
		findByReference.setMessage(transactionSatus.getMessage());
		findByReference.setLock(transactionSatus.getLock());
		findByReference.setOrder(transactionSatus.getOrder());
		findByReference.setSource(transactionSatus.getSource());
		findByReference.setTransaction(transactionSatus.getTransaction());
	}

	public Object createFcmbCashPickUp(FCMBCashPickUp fcmbCashPickUp, String authorizationToken) {
		CommonResponse commonResponse = null;
		
		try{
			FCMBCashPickUp fcmCashPickUpDatabase = fcmbCashPickUpRepository.findByReference(fcmbCashPickUp.getTransaction().getReference());
			commonResponse = payoutAPICallService.createFCMBCashPickUp(authorizationToken, fcmbCashPickUp).execute().body();
			CommonResponse commonResponseDatabase = null;
			if(commonResponse.getTransaction().getReference() != null) {
				 commonResponseDatabase = commonResponseRepository.findByReference(commonResponse.getTransaction().getReference());
			}
			
			if(fcmCashPickUpDatabase != null) {
				updateFcmbCashPickUp(fcmbCashPickUp, fcmCashPickUpDatabase); // Update Cash Pick Up reference-No is Non Unique
			}
			if(commonResponseDatabase != null) { // Update Common Response if reference-No is Non Unique
				commonResponseDatabase.setCode(commonResponse.getCode());
				commonResponseDatabase.setMessage(commonResponse.getMessage());
				commonResponseDatabase.setTransaction(commonResponse.getTransaction());
			}
			
			if(fcmbCashPickUp != null && commonResponse.getTransaction().getReference() != null) {
				fcmbCashPickUpRepository.save(fcmCashPickUpDatabase);
				commonResponseRepository.save(commonResponseDatabase);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return commonResponse;
	}

	private void updateFcmbCashPickUp(FCMBCashPickUp fcmbCashPickUp, FCMBCashPickUp fcmCashPickUpDatabase) {
		fcmCashPickUpDatabase.setPublickey(fcmbCashPickUp.getPublickey());
		fcmCashPickUpDatabase.setOrder(fcmbCashPickUp.getOrder());
		fcmCashPickUpDatabase.setTransaction(fcmbCashPickUp.getTransaction());
		fcmCashPickUpDatabase.setSource(fcmbCashPickUp.getSource());
	}
}
