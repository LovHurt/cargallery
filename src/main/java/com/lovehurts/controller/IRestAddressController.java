package com.lovehurts.controller;

import com.lovehurts.dto.DtoAddress;
import com.lovehurts.dto.DtoAddressIU;

public interface IRestAddressController {

	public RootEntity<DtoAddress> saveAddress(DtoAddressIU dtoAddressIU);
}
