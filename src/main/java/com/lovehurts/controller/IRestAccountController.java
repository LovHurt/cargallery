package com.lovehurts.controller;

import com.lovehurts.dto.DtoAccount;
import com.lovehurts.dto.DtoAccountIU;

public interface IRestAccountController {

    public RootEntity<DtoAccount> saveAccount(DtoAccountIU dtoAccountIU);
}
