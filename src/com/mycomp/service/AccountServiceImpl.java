package com.mycomp.service;

import com.mycomp.dao.IAccountDao;
import com.mycomp.domain.Account;

public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void save(Account account) {
        System.out.println("AccountServiceImpl---save: " + account);
        accountDao.save(account);
    }

}
