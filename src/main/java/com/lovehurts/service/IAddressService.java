package com.lovehurts.service;

import com.lovehurts.dto.DtoAddress;
import com.lovehurts.dto.DtoAddressIU;

public interface IAddressService {

	public DtoAddress saveAddress(DtoAddressIU dtoAddressIU);
}
