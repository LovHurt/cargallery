package com.lovehurts.controller.impl;

import com.lovehurts.controller.IRestCustomerController;
import com.lovehurts.controller.RestBaseController;
import com.lovehurts.controller.RootEntity;
import com.lovehurts.dto.DtoCustomer;
import com.lovehurts.dto.DtoCustomerIU;
import com.lovehurts.service.ICustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/customer")
public class RestCustomerControllerImpl extends RestBaseController implements IRestCustomerController {

    @Autowired
    private ICustomerService customerService;

    @Override
    @PostMapping("/save")
    public RootEntity<DtoCustomer> saveCustomer(@Valid @RequestBody DtoCustomerIU dtoCustomerIU) {
        return  ok(customerService.saveCustomer(dtoCustomerIU));
    }
}
