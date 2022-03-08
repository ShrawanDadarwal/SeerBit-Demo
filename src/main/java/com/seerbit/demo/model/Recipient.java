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

}
