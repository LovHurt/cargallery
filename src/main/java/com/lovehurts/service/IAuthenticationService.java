package com.lovehurts.service;

import com.lovehurts.dto.AuthRequest;
import com.lovehurts.dto.AuthResponse;
import com.lovehurts.dto.DtoUser;
import com.lovehurts.dto.RefreshTokenRequest;

public interface IAuthenticationService {


	public DtoUser register(AuthRequest input);
	
	public AuthResponse authenticate(AuthRequest input);
	
	public AuthResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
