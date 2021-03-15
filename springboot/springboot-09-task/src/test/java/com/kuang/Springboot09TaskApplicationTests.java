package com.kuang;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class Springboot09TaskApplicationTests {
    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test
    void contextLoads() {
        //简单的邮件
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("测试");
        message.setText("真的是一个测试");
        message.setTo("1564821576@qq.com");
        message.setFrom("1013446801@qq.com");
        javaMailSender.send(message);
    }

    @Test
    void contextLoads2() throws MessagingException {
        //复杂的邮件
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        //组装
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        //正文
        helper.setSubject("主题");
        helper.setText("<p style='color:red'>谢谢</p>",true);
        //附件
        helper.addAttachment("1.txt", new File("C:\\Users\\Z\\Desktop\\1.txt"));
        helper.setTo("1013446801@qq.com");
        helper.setFrom("1013446801@qq.com");
        javaMailSender.send(mimeMessage);
    }

}
