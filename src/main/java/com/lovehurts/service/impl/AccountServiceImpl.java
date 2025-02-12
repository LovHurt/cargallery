package com.lovehurts.service.impl;

import com.lovehurts.dto.DtoAccount;
import com.lovehurts.dto.DtoAccountIU;
import com.lovehurts.model.Account;
import com.lovehurts.repository.AccountRepository;
import com.lovehurts.service.IAccountService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountRepository accountRepository;

    private Account createAccount(DtoAccountIU dtoAccountIU) {
        Account account = new Account();
        account.setCreateTime(new Date());
        account.setAccountNo(dtoAccountIU.getAccountNo());

        BeanUtils.copyProperties(dtoAccountIU, account);
        return account;
    }

    @Override
    public DtoAccount saveAccount(DtoAccountIU dtoAccountIU) {
        DtoAccount dtoAccount = new DtoAccount();
        Account savedAccount = accountRepository.save(createAccount(dtoAccountIU));

        BeanUtils.copyProperties(savedAccount, dtoAccount);

        return dtoAccount;
    }
}
