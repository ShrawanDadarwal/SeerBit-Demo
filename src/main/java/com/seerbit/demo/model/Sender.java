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
public class Sender {

	private String name;

	private String address;

	private String mobile;

	private String country;

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
		return "Sender [name=" + name + ", address=" + address + ", mobile=" + mobile + ", country=" + country
				+ ", idtype=" + idtype + ", idnumber=" + idnumber + ", idexpiry=" + idexpiry + "]";
	}

}
