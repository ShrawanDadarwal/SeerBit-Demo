package com.seerbit.demo.model;

import org.springframework.data.annotation.Id;

public class FCMBCashPickUp {
	@Id
	private String id;

	private String publickey;

	private FCMBTransaction transaction;

	private FCMBOrder order;

	private FCMBSource source;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPublickey() {
		return publickey;
	}

	public void setPublickey(String publickey) {
		this.publickey = publickey;
	}

	public FCMBTransaction getTransaction() {
		return transaction;
	}

	public void setTransaction(FCMBTransaction transaction) {
		this.transaction = transaction;
	}

	public FCMBOrder getOrder() {
		return order;
	}

	public void setOrder(FCMBOrder order) {
		this.order = order;
	}

	public FCMBSource getSource() {
		return source;
	}

	public void setSource(FCMBSource source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "FCMBCashPickUp [id=" + id + ", publickey=" + publickey + ", transaction=" + transaction + ", order="
				+ order + ", source=" + source + "]";
	}

}
