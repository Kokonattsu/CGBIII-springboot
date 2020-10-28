package com.cy.pj.Mail.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MailServiceTests {
    @Autowired
    private MailService mailService;

    @Test
    void testSendMail(){
        mailService.sendMail("");
        System.out.println(mailService);
    }
}
