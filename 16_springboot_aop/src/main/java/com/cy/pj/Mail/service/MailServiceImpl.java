package com.cy.pj.Mail.service;

import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService{
    @Override
    public boolean sendMail(String msg) {
        System.out.println("send=>"+msg);
        return true;
    }
}
