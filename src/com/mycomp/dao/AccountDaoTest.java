package com.mycomp.dao;

import com.mycomp.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountDaoTest {
    @Resource(name = "accountDao")
    private IAccountDao accountDao;


    @Test
    public void test1() {
        Account account = this.accountDao.getById(22);
        System.out.println(account);
        account.setMoney(2048.5d);
        this.accountDao.update(account);
    }

    @Test
    public void test2() {
        List<Account> allAccount = this.accountDao.getAllAccount();
        for (Account account : allAccount) {
            System.out.println(account);
        }
    }

}
