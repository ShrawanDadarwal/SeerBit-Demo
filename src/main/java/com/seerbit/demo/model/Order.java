package com.seerbit.demo.model;

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
public class Order {
	private String amount;

	private String description;

	private String reason;

	private String currency;

	private String country;

	private String secretquestion;

	private String secretanswer;
}
