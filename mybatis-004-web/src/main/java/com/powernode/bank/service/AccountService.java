package com.powernode.bank.service;

import com.powernode.bank.exceptions.MoneyNotEnoughException;
import com.powernode.bank.exceptions.TransferException;

public interface AccountService  {
    void  transfer(String fromActno,String toActno,double money) throws MoneyNotEnoughException, TransferException;
    //1.转出账户余额是否充足（select）
    //2.转出账户余额不足，提示用户
    //3.如果转出账户余额充足，转出
}
