package com.lovehurts.exception;

import lombok.Getter;

@Getter
public enum MessageType {
	NO_RECORD_EXIST("1004", "record can not be found"), 
	TOKEN_IS_EXPIRED("1005", "token duration is over"),
	USERNAME_NOT_FOUND("1006", "username can not be found"),
	USERNAME_OR_PASSWORD_INVALID("1007", "username or password is invalid"),
	REFRESH_TOKEN_NOT_FOUND("1008", "refresh token can not be found"),
	REFRESH_TOKEN_IS_EXPIRED("1009", "refresh token is expired"),
	GENERAL_EXCEPTION("9999", "general exception occured");

	private String code;

	private String message;

	MessageType(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
