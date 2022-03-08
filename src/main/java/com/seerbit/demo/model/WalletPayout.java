package com.seerbit.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "wallet_payout")
public class WalletPayout {
	
		private String publickey;
		
		private WalletPayoutTransaction transaction;
		
		private WalletPayoutOrder order;
		
		private WalletPayoutSource source;
		
		
}
