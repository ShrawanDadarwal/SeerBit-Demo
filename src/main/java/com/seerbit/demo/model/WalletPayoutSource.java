package com.seerbit.demo.model;

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
public class WalletPayoutSource {
	
	private String operation;
	
	private WalletPayoutSender sender;
	
	private WallelPayoutRecipient recipient;

}
