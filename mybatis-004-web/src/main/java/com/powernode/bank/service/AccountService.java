package com.powernode.bank.service;

import javax.servlet.http.HttpServlet;

public interface AccountService  {
    void  transfer(String fromActno,String toActno,double money);
    //1.转出账户余额是否充足（select）
    //2.转出账户余额不足，提示用户
    //3.如果转出账户余额充足，转出
}
