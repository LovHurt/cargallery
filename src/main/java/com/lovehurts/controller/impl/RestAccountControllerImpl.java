package com.lovehurts.controller.impl;

import com.lovehurts.controller.IRestAccountController;
import com.lovehurts.controller.RestBaseController;
import com.lovehurts.controller.RootEntity;
import com.lovehurts.dto.DtoAccount;
import com.lovehurts.dto.DtoAccountIU;
import com.lovehurts.service.IAccountService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/account")
public class RestAccountControllerImpl extends RestBaseController implements IRestAccountController {

    @Autowired
    private IAccountService accountService;

    @PostMapping("/save")
    @Override
    public RootEntity<DtoAccount> saveAccount(@Valid @RequestBody DtoAccountIU dtoAccountIU) {

        return ok(accountService.saveAccount(dtoAccountIU));
    }
}
