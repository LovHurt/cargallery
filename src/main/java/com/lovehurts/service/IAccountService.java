package com.lovehurts.service;

import com.lovehurts.dto.DtoAccount;
import com.lovehurts.dto.DtoAccountIU;

public interface IAccountService {

    public DtoAccount saveAccount(DtoAccountIU dtoAccountIU);
}
