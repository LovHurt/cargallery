package com.lovehurts.controller;

import com.lovehurts.dto.AuthRequest;
import com.lovehurts.dto.AuthResponse;
import com.lovehurts.dto.DtoUser;

public interface IRestAuthenticationController {

	public RootEntity<DtoUser> register(AuthRequest input);
	
	public RootEntity<AuthResponse> authenticate(AuthRequest input);
}
