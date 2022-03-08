package com.seerbit.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seerbit.demo.model.AcPayoutToNigeria;
import com.seerbit.demo.model.FCMBCashPickUp;
import com.seerbit.demo.model.WalletPayout;
import com.seerbit.demo.service.PayoutService;

import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PayoutController {
	@Autowired
	private PayoutService payoutService;

	@SuppressWarnings("static-access")
	@GetMapping("/checkTransactionStatus")
	public ResponseEntity<?> checkTransactionStatus(@RequestParam("reference") String reference,
			@RequestHeader("Authorization") String authorizationToken) {
		return new ResponseEntity<>(HttpStatus.ACCEPTED).ok(payoutService.checkTransactionStatus(reference, authorizationToken));
	}
	
	@SuppressWarnings("static-access")
	@PostMapping("/payout/create")
	public ResponseEntity<?> createFcmbCashPickUp(@RequestBody FCMBCashPickUp fcmbCashPickUp,
			@RequestHeader("Authorization") String authorizationToken) {
		return new ResponseEntity<>(HttpStatus.CREATED).ok(payoutService.createFcmbCashPickUp(fcmbCashPickUp, authorizationToken));
	}
	
	@SuppressWarnings("static-access")
	@PostMapping("/account/payout")
	public ResponseEntity<?> createAccoutPayoutToNigeria(@RequestBody AcPayoutToNigeria acPayoutToNigeria,
			@RequestHeader("Authorization") String authorizationToken) {
		return new ResponseEntity<>(HttpStatus.CREATED).ok(payoutService.createAccoutPayoutToNigeria(acPayoutToNigeria, authorizationToken));
	}
	
	@SuppressWarnings("static-access")
	@PostMapping("/wallet/account/payout")
	public ResponseEntity<?> createWalletPayout(@RequestBody WalletPayout walletPayout,
			@RequestHeader("Authorization") String authorizationToken) {
		return new ResponseEntity<>(HttpStatus.CREATED).ok(payoutService.createWalletPayout(walletPayout, authorizationToken));
	}
}
