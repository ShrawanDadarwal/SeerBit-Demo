package com.seerbit.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "Transaction_Status")
public class TransactionStatus {
	@Id 
	private String id;
	
	private String code;
	
	private String message;
	
	private Transaction transaction;
	
	private Lock lock;

	private Order order;

	private Source source;

}
