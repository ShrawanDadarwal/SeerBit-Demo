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
@Document(collection = "fcmb_cash_pick_up")
public class FCMBCashPickUp {
	@Id
	private String id;

	private String publickey;

	private FCMBTransaction transaction;

	private FCMBOrder order;

	private FCMBSource source;
}
