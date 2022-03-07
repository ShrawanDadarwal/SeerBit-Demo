package com.seerbit.demo.model;

import java.util.List;

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
public class Recipient {
	private String name;

	private String address;

	private String accountnumber;

	private String bankcode;

	private String idtype;

	private String idnumber;

	private String idexpiry;

	private List<String> requiredfields;

	private String beneIDIssuedBy;

	private String beneIDIssuedByCountry;

	private String beneIDIssuedByState;

	private String beneIDIssueDate;

	private String beneCity;

	private String beneCounty;

	private String beneState;

	private String benePostalCode;

	private String beneCountry;

	private String beneNationality;

	private String beneCountryOfResidence;

	private String beneDateOfBirth;

	private String beneCountryOfBirth;

	private String beneStateOfBirth;

	private String beneCityOfBirth;

	private String beneOccupation;

	private String beneGender;

	private String beneTaxID;

	private String beneCustRelationship;

	private String beneDistrict;

	private String beneIdentityCode;

	private String beneCURPNumber;

	private String onBehalfO;

	private String beneIDType;

	private String beneAddress;

	private String beneTelNo;

	private String beneIDNumber;

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

	public List<String> getRequiredfields() {
		return requiredfields;
	}

	public void setRequiredfields(List<String> requiredfields) {
		this.requiredfields = requiredfields;
	}

	public String getBeneIDIssuedBy() {
		return beneIDIssuedBy;
	}

	public void setBeneIDIssuedBy(String beneIDIssuedBy) {
		this.beneIDIssuedBy = beneIDIssuedBy;
	}

	public String getBeneIDIssuedByCountry() {
		return beneIDIssuedByCountry;
	}

	public void setBeneIDIssuedByCountry(String beneIDIssuedByCountry) {
		this.beneIDIssuedByCountry = beneIDIssuedByCountry;
	}

	public String getBeneIDIssuedByState() {
		return beneIDIssuedByState;
	}

	public void setBeneIDIssuedByState(String beneIDIssuedByState) {
		this.beneIDIssuedByState = beneIDIssuedByState;
	}

	public String getBeneIDIssueDate() {
		return beneIDIssueDate;
	}

	public void setBeneIDIssueDate(String beneIDIssueDate) {
		this.beneIDIssueDate = beneIDIssueDate;
	}

	public String getBeneCity() {
		return beneCity;
	}

	public void setBeneCity(String beneCity) {
		this.beneCity = beneCity;
	}

	public String getBeneCounty() {
		return beneCounty;
	}

	public void setBeneCounty(String beneCounty) {
		this.beneCounty = beneCounty;
	}

	public String getBeneState() {
		return beneState;
	}

	public void setBeneState(String beneState) {
		this.beneState = beneState;
	}

	public String getBenePostalCode() {
		return benePostalCode;
	}

	public void setBenePostalCode(String benePostalCode) {
		this.benePostalCode = benePostalCode;
	}

	public String getBeneCountry() {
		return beneCountry;
	}

	public void setBeneCountry(String beneCountry) {
		this.beneCountry = beneCountry;
	}

	public String getBeneNationality() {
		return beneNationality;
	}

	public void setBeneNationality(String beneNationality) {
		this.beneNationality = beneNationality;
	}

	public String getBeneCountryOfResidence() {
		return beneCountryOfResidence;
	}

	public void setBeneCountryOfResidence(String beneCountryOfResidence) {
		this.beneCountryOfResidence = beneCountryOfResidence;
	}

	public String getBeneDateOfBirth() {
		return beneDateOfBirth;
	}

	public void setBeneDateOfBirth(String beneDateOfBirth) {
		this.beneDateOfBirth = beneDateOfBirth;
	}

	public String getBeneCountryOfBirth() {
		return beneCountryOfBirth;
	}

	public void setBeneCountryOfBirth(String beneCountryOfBirth) {
		this.beneCountryOfBirth = beneCountryOfBirth;
	}

	public String getBeneStateOfBirth() {
		return beneStateOfBirth;
	}

	public void setBeneStateOfBirth(String beneStateOfBirth) {
		this.beneStateOfBirth = beneStateOfBirth;
	}

	public String getBeneCityOfBirth() {
		return beneCityOfBirth;
	}

	public void setBeneCityOfBirth(String beneCityOfBirth) {
		this.beneCityOfBirth = beneCityOfBirth;
	}

	public String getBeneOccupation() {
		return beneOccupation;
	}

	public void setBeneOccupation(String beneOccupation) {
		this.beneOccupation = beneOccupation;
	}

	public String getBeneGender() {
		return beneGender;
	}

	public void setBeneGender(String beneGender) {
		this.beneGender = beneGender;
	}

	public String getBeneTaxID() {
		return beneTaxID;
	}

	public void setBeneTaxID(String beneTaxID) {
		this.beneTaxID = beneTaxID;
	}

	public String getBeneCustRelationship() {
		return beneCustRelationship;
	}

	public void setBeneCustRelationship(String beneCustRelationship) {
		this.beneCustRelationship = beneCustRelationship;
	}

	public String getBeneDistrict() {
		return beneDistrict;
	}

	public void setBeneDistrict(String beneDistrict) {
		this.beneDistrict = beneDistrict;
	}

	public String getBeneIdentityCode() {
		return beneIdentityCode;
	}

	public void setBeneIdentityCode(String beneIdentityCode) {
		this.beneIdentityCode = beneIdentityCode;
	}

	public String getBeneCURPNumber() {
		return beneCURPNumber;
	}

	public void setBeneCURPNumber(String beneCURPNumber) {
		this.beneCURPNumber = beneCURPNumber;
	}

	public String getOnBehalfO() {
		return onBehalfO;
	}

	public void setOnBehalfO(String onBehalfO) {
		this.onBehalfO = onBehalfO;
	}

	public String getBeneIDType() {
		return beneIDType;
	}

	public void setBeneIDType(String beneIDType) {
		this.beneIDType = beneIDType;
	}

	public String getBeneAddress() {
		return beneAddress;
	}

	public void setBeneAddress(String beneAddress) {
		this.beneAddress = beneAddress;
	}

	public String getBeneTelNo() {
		return beneTelNo;
	}

	public void setBeneTelNo(String beneTelNo) {
		this.beneTelNo = beneTelNo;
	}

	public String getBeneIDNumber() {
		return beneIDNumber;
	}

	public void setBeneIDNumber(String beneIDNumber) {
		this.beneIDNumber = beneIDNumber;
	}

	@Override
	public String toString() {
		return "Recipient [name=" + name + ", address=" + address + ", accountnumber=" + accountnumber + ", bankcode="
				+ bankcode + ", idtype=" + idtype + ", idnumber=" + idnumber + ", idexpiry=" + idexpiry
				+ ", requiredfields=" + requiredfields + ", beneIDIssuedBy=" + beneIDIssuedBy
				+ ", beneIDIssuedByCountry=" + beneIDIssuedByCountry + ", beneIDIssuedByState=" + beneIDIssuedByState
				+ ", beneIDIssueDate=" + beneIDIssueDate + ", beneCity=" + beneCity + ", beneCounty=" + beneCounty
				+ ", beneState=" + beneState + ", benePostalCode=" + benePostalCode + ", beneCountry=" + beneCountry
				+ ", beneNationality=" + beneNationality + ", beneCountryOfResidence=" + beneCountryOfResidence
				+ ", beneDateOfBirth=" + beneDateOfBirth + ", beneCountryOfBirth=" + beneCountryOfBirth
				+ ", beneStateOfBirth=" + beneStateOfBirth + ", beneCityOfBirth=" + beneCityOfBirth
				+ ", beneOccupation=" + beneOccupation + ", beneGender=" + beneGender + ", beneTaxID=" + beneTaxID
				+ ", beneCustRelationship=" + beneCustRelationship + ", beneDistrict=" + beneDistrict
				+ ", beneIdentityCode=" + beneIdentityCode + ", beneCURPNumber=" + beneCURPNumber + ", onBehalfO="
				+ onBehalfO + ", beneIDType=" + beneIDType + ", beneAddress=" + beneAddress + ", beneTelNo=" + beneTelNo
				+ ", beneIDNumber=" + beneIDNumber + "]";
	}
	
}
