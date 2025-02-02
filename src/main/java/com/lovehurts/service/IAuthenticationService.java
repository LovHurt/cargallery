package com.lovehurts.service;

import com.lovehurts.dto.AuthRequest;
import com.lovehurts.dto.DtoUser;

public interface IAuthenticationService {


	public DtoUser register(AuthRequest input);
	
	
}
