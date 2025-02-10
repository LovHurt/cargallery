package com.lovehurts.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lovehurts.controller.IRestAuthenticationController;
import com.lovehurts.controller.RestBaseController;
import com.lovehurts.controller.RootEntity;
import com.lovehurts.dto.AuthRequest;
import com.lovehurts.dto.AuthResponse;
import com.lovehurts.dto.DtoUser;
import com.lovehurts.service.IAuthenticationService;

import jakarta.validation.Valid;

@RestController
public class RestAuthenticationControllerImpl extends RestBaseController implements IRestAuthenticationController{

	@Autowired
	private IAuthenticationService authenticationService;
	
	@PostMapping("/register")
	@Override
	public RootEntity<DtoUser> register(@Valid @RequestBody AuthRequest input) {
		return ok(authenticationService.register(input));
	}

	@PostMapping("/autheticate")
	@Override
	public RootEntity<AuthResponse> authenticate(@Valid @RequestBody AuthRequest input) {
		
		return ok(authenticationService.authenticate(input));
	}

	
}
