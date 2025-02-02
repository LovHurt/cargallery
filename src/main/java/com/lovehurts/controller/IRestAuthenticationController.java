package com.lovehurts.controller;

import com.lovehurts.dto.AuthRequest;
import com.lovehurts.dto.DtoUser;

public interface IRestAuthenticationController {

	public RootEntity<DtoUser> register(AuthRequest input);
}
