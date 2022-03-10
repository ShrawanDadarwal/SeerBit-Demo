package com.seerbit.demo.payoutAPIService;



import com.seerbit.demo.model.AcPayoutToNigeria;
import com.seerbit.demo.model.FCMBCashPickUp;
import com.seerbit.demo.model.TransactionStatus;
import com.seerbit.demo.model.WalletPayout;
import com.seerbit.demo.response.CancelCashPickUpResponse;
import com.seerbit.demo.response.CommonResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface PayoutAPICallService {
	 @GET("payout/status")
	 Call<TransactionStatus> checkStatus(@Header("Authorization") String accessToken,@Query("reference") String reference);
	 
	 @POST("payout/create")
	 Call<CommonResponse> createFCMBCashPickUp(@Header("Authorization") String accessToken,@Body FCMBCashPickUp fcmbCashPickUp);
	 

	 @POST("account/payout")
	 Call<CommonResponse> accountPayoutToNigeria(@Header("Authorization") String accessToken,@Body AcPayoutToNigeria acPayoutToNigeria);
	 
	 @POST("account/payout")
	 Call<CommonResponse> walletPayout(@Header("Authorization") String accessToken,@Body WalletPayout walletPayout);
	 
	 @POST("payout/cancel")
	 Call<CancelCashPickUpResponse> cancelCashPickUpTransaction(@Header("Authorization") String accessToken,@Body FCMBCashPickUp fcmbCashPickUp);
	 
	 @POST("payout/update")
	 Call<CommonResponse> updateCashPickUpTransaction(@Header("Authorization") String accessToken,@Body FCMBCashPickUp fcmbCashPickUp);
}
