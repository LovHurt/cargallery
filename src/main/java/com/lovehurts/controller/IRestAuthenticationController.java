package com.lovehurts.controller;

import com.lovehurts.dto.AuthRequest;
import com.lovehurts.dto.AuthResponse;
import com.lovehurts.dto.DtoUser;
import com.lovehurts.dto.RefreshTokenRequest;

public interface IRestAuthenticationController {

	public RootEntity<DtoUser> register(AuthRequest input);
	
	public RootEntity<AuthResponse> authenticate(AuthRequest input);
	
	public RootEntity<AuthResponse> refreshToken(RefreshTokenRequest input);
}
