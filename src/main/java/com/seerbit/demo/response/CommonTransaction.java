package com.seerbit.demo.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommonTransaction {

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
		return "CommonTransaction [reference=" + reference + ", linkingreference=" + linkingreference + "]";
	}

}
