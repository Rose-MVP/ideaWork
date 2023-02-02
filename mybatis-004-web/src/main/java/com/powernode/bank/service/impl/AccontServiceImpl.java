package com.powernode.bank.service.impl;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.dao.impl.AccountDaoImpl;
import com.powernode.bank.exceptions.MoneyNotEnoughException;
import com.powernode.bank.exceptions.TransferException;
import com.powernode.bank.pojo.Account;
import com.powernode.bank.service.AccountService;

public class AccontServiceImpl implements AccountService {
    private AccountDao accountDao =new AccountDaoImpl();
    @Override
    public void transfer(String fromActno, String toActno, double money) throws MoneyNotEnoughException, TransferException {
        Account fromAct = accountDao.selectByActno(fromActno);
        if (fromAct.getBalance() <money){
        throw  new MoneyNotEnoughException("对不起，余额不足!");
        }
        //余额充足，更新转出账户
        //先更新内存中java对象的account的余额
        Account toAct = accountDao.selectByActno(toActno);
        fromAct.setBalance(fromAct.getBalance()-money);
        toAct.setBalance(toAct.getBalance()+money);
        int count =accountDao.updateByActno(fromAct);
        //模拟异常
        String s=null;
        s.toString();

        count+= accountDao.updateByActno(toAct);
        if (count!=2){
        throw new TransferException("转账异常，未知原因");
        }
    }
}
