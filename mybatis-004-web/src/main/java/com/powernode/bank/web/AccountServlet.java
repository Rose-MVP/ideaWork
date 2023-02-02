package com.powernode.bank.web;

import com.powernode.bank.exceptions.MoneyNotEnoughException;
import com.powernode.bank.exceptions.TransferException;
import com.powernode.bank.service.AccountService;
import com.powernode.bank.service.impl.AccontServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;

@WebServlet("/transfer")
public class AccountServlet extends HttpServlet {
   private AccountService accountService =new AccontServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取表单数据
        String fromActno = req.getParameter("fromActno");
        String toActno = req.getParameter("toActno");
        double money = Double.parseDouble(req.getParameter("money"));
        //调Service 的转账方法完成转账
        try {
            accountService.transfer(fromActno,toActno,money);
            //转账成功，调用视图，展示结果
            resp.sendRedirect(req.getContextPath()+"/success.html");

        } catch (MoneyNotEnoughException e) {
            resp.sendRedirect(req.getContextPath()+"/error1.html");
        } catch (TransferException e) {
            resp.sendRedirect(req.getContextPath()+"/error2.html");
        }catch (Exception e){
            resp.sendRedirect(req.getContextPath()+"/error2.html");

        }
    }
}
