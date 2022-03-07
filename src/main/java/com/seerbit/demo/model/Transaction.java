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
public class Transaction {
	
	private String reference;

	private String linkingreference;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getLinkingreference() {
		return linkingreference;
	}

	public void setLinkingreference(String linkingreference) {
		this.linkingreference = linkingreference;
	}

	@Override
	public String toString() {
		return "Transaction [reference=" + reference + ", linkingreference=" + linkingreference + "]";
	}
	
	
}
