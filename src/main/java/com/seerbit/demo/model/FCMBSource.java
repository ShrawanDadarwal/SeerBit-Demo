package com.seerbit.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FCMBSource {
	private FCMBSender sender;

	private FCMBRecipient recipient;

	public FCMBSender getSender() {
		return sender;
	}

	public void setSender(FCMBSender sender) {
		this.sender = sender;
	}

	public FCMBRecipient getRecipient() {
		return recipient;
	}

	public void setRecipient(FCMBRecipient recipient) {
		this.recipient = recipient;
	}
	

}
