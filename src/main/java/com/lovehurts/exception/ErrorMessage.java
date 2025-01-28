package com.lovehurts.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class ErrorMessage {

	private MessageType messageType;
	private String ofStatic;
	
	public ErrorMessage(MessageType messageType, String ofStatic) {
        this.messageType = messageType;
        this.ofStatic = ofStatic;
    }


	public String prepareErrorMesssage() {
		StringBuilder builder = new StringBuilder();
		builder.append(messageType.getMessage());
		if(this.ofStatic != null) {
			builder.append(" : " + ofStatic);
		}
		return builder.toString();
	}
	
}
