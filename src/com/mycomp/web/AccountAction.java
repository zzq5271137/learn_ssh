package com.mycomp.web;

import com.mycomp.domain.Account;
import com.mycomp.service.IAccountService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import lombok.Setter;

public class AccountAction extends ActionSupport implements ModelDriven<Account> {

    private Account account = new Account();

    // struts2提供的spring对象自动注入(根据类型注入)
    // 需要struts2-spring-plugin-2.5.16.jar
    @Setter
    private IAccountService accountService;

    @Override
    public Account getModel() {
        return account;
    }

    public String save() {
        System.out.println("AccountAction---save: " + account);

        /*
        // 通过spring获取service层对象
        ServletContext servletContext = ServletActionContext.getServletContext();
        WebApplicationContext applicationContext =
                WebApplicationContextUtils.getWebApplicationContext(servletContext);
        IAccountService accountService =
                (IAccountService) applicationContext.getBean("accountService");
         */

        accountService.save(account);

        return null;
    }

}
