package com.seerbit.demo.model;

import lombok.Getter;

import lombok.Setter;

@Getter
@Setter
public class FCMBTransaction {

	private String reference;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "FCMBTransaction [reference=" + reference + "]";
	}

}
