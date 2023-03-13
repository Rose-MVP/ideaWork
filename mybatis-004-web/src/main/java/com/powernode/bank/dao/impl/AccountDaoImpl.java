package com.powernode.bank.dao.impl;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.pojo.Account;
import com.powernode.bank.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class AccountDaoImpl implements AccountDao {
    @Override
    public Account selectByActno(String arg0) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
//        Account account  = (Account)sqlSession.selectOne("account.selectActno", actno);
//        sqlSession.close();
//        return account;
        return  (Account) sqlSession.selectOne("selectByActno,arg0");
    }

    @Override
    public int updateByActno(Account arg0) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
//        int count = sqlSession.update("account.updateAct",act);
//        sqlSession.commit();
//        sqlSession.close();
        return sqlSession.update("account.updateAct",arg0);
    }

    @Override
    public void delete() {

    }

    @Override
    public void insert() {

    }

    @Override
    public void update(String aaaa, double v) {

    }
}
