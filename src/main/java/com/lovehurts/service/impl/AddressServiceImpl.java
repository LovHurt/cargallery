package com.lovehurts.service.impl;

import org.springframework.stereotype.Service;

import com.lovehurts.exception.BaseException;
import com.lovehurts.exception.ErrorMessage;
import com.lovehurts.exception.MessageType;

@Service
public class AddressServiceImpl {

	public void test() {
		throw new BaseException(new ErrorMessage(MessageType.GENERAL_EXCEPTION, "TEST MESSAGE"));
	}
}
