package com.seerbit.demo.model;

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
public class FCMBRecipient {
	private String name;

	private String address;

	private String accountnumber;

	private String bankcode;

	private String idtype;

	private String idnumber;

	private String idexpiry;

}
