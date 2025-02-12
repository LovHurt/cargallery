package com.lovehurts.service;

import com.lovehurts.dto.DtoCustomer;
import com.lovehurts.dto.DtoCustomerIU;
import com.lovehurts.model.Customer;
import com.lovehurts.repository.AddressRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public interface ICustomerService {

    public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomerUI);
}
