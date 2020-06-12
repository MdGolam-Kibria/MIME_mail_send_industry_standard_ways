package com.example.mailSender.mailService.forSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.Properties;

@Configuration
public class EmailConstrint {


    ;
    //this userName must match with the application.properties spring.mail.username
    @Value("${spring.mail.username}")
    public String username;
    @Value("${spring.mail.password}")
    public String password;
    @Value("${spring.mail.port}")
    public String port;
    @Value("${spring.mail.host}")
    public String host;
    @Value("${spring.mail.isAutht}")
    public String isAuth;//for check user authenticate or not
    @Value("${spring.mail.tls}")
    public String isTls;

    private Properties getPropertiesInstance() {
        Properties properties = new Properties();

        properties.put("mial.smtp.post",host);
        properties.put("mial.smtp.port",port);
        properties.put("mial.smtp.auth",isAuth);
        properties.put("mial.smtp.starttls.enable",isTls);
        return properties;
    }

    public Session getSessionInstance() {
        return Session.getInstance(getPropertiesInstance(), new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username,password);
            }
        });
    }
}
