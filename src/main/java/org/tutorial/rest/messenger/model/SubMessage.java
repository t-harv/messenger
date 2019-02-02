package org.tutorial.rest.messenger.model;

public class SubMessage {
	private String secretMessage;

	public SubMessage() {
	}
	
	public SubMessage(String secretMessage) {
		this.secretMessage = secretMessage;
	}
	public String getSecretMessage() {
		return secretMessage;
	}

	public void setSecretMessage(String secretMessage) {
		this.secretMessage = secretMessage;
	}

}
