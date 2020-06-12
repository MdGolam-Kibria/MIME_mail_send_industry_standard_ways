package com.example.mailSender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailSenderApplication {//send MIME mail

	public static void main(String[] args) {
		SpringApplication.run(MailSenderApplication.class, args);
	}

}
