package com.powernode.bank.web;

import com.powernode.bank.service.AccountService;
import com.powernode.bank.service.impl.AccontServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/transfer")
public class AccountServlet extends HttpServlet {
    AccountService accountService =new AccontServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取表单数据
        String fromActno = req.getParameter("fromActno");
        String toActno = req.getParameter("toActno");
        double money = Double.parseDouble(req.getParameter("money"));
        //调Service 的转账方法完成转账
        accountService.transfer("","",11.11);
    }
}
