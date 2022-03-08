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
public class WalletPayoutSender {
	private String name; 
	
	private String address;
	
	private String mobile;
	
	private String country;
	
	private String idtype;
	
	private String idnumber;
	
	private String dexpiry;
}
