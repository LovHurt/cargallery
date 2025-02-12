package com.lovehurts.controller;

import com.lovehurts.dto.DtoCustomer;
import com.lovehurts.dto.DtoCustomerIU;

public interface IRestCustomerController {
    public RootEntity<DtoCustomer> saveCustomer(DtoCustomerIU dtoCustomerIU);
}
