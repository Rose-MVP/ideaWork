package com.powernode.bank.dao.impl;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.pojo.Account;
import com.powernode.bank.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class AccountDaoImpl implements AccountDao {
    @Override
    public Account selectByActno(String actno) {
        SqlSession sqlSession = SqlSessionUtil.OpenSession();
        Account account  = (Account)sqlSession.selectOne("account.selectActno", actno);
        sqlSession.close();
        return account;
    }

    @Override
    public int updateByActno(Account act) {
        SqlSession sqlSession = SqlSessionUtil.OpenSession();
        int count = sqlSession.update("account.updateAct",act);
        sqlSession.commit();
        sqlSession.close();
        return count;
    }
}
