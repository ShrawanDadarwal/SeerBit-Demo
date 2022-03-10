package com.seerbit.demo.response;

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
public class CancelCashPickUpResponse {
	private String code;
	
	private String message;
	
	private CancelCashPickUpTransaction transaction;
}
