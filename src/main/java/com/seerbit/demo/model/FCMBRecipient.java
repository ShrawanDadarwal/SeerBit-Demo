package com.seerbit.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FCMBRecipient {
	private String name;

	private String address;

	private String accountnumber;

	private String bankcode;

	private String idtype;

	private String idnumber;

	private String idexpiry;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	public String getIdtype() {
		return idtype;
	}

	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getIdexpiry() {
		return idexpiry;
	}

	public void setIdexpiry(String idexpiry) {
		this.idexpiry = idexpiry;
	}

	@Override
	public String toString() {
		return "FCMBRecipient [name=" + name + ", address=" + address + ", accountnumber=" + accountnumber
				+ ", bankcode=" + bankcode + ", idtype=" + idtype + ", idnumber=" + idnumber + ", idexpiry=" + idexpiry
				+ "]";
	}
	

}
