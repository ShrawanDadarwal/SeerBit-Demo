package com.seerbit.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "account_payout_to_nigeria")
public class AcPayoutToNigeria {
	@Id
	private String id;

	private String publickey;
	
	private AcPayoutToNigeriaTransaction transaction;
	
	private AcPayoutToNigeriaOrder order;
	
	private AcPayoutToNigeriaSource source;
}
