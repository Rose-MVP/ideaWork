package com.powernode.bank.dao;

import com.powernode.bank.pojo.Account;

public interface AccountDao {
    Account selectByActno(String actno);
    int updateByActno(Account act);
    void delete();
    void insert();

    void update(String aaaa, double v);
}
