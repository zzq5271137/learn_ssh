package com.mycomp.dao;

import com.mycomp.domain.Account;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class AccountDaoImpl extends HibernateDaoSupport implements IAccountDao {

    @Override
    public void save(Account account) {
        System.out.println("AccountDaoImpl---save: " + account);
        this.getHibernateTemplate().save(account);
    }

    @Override
    public void update(Account account) {
        this.getHibernateTemplate().update(account);
    }

    @Override
    public void delete(Account account) {
        this.getHibernateTemplate().delete(account);
    }

    @Override
    public Account getById(Integer id) {
        return this.getHibernateTemplate().get(Account.class, id);
    }

    @Override
    public List<Account> getAllAccount() {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Account.class);
        List<Account> accounts =
                (List<Account>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
        return accounts;
    }
}
