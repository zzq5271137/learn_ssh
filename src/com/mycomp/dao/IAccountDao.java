package com.mycomp.dao;

import com.mycomp.domain.Account;

import java.util.List;

public interface IAccountDao {

    void save(Account account);

    void update(Account account);

    void delete(Account account);

    Account getById(Integer id);

    List<Account> getAllAccount();

}
