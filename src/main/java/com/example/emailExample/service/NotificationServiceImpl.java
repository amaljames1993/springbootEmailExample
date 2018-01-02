package com.example.emailExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.emailExample.model.User;

@Service
public class NotificationServiceImpl implements NotificationService {
	private JavaMailSender javaMailSender;
	
	@Autowired
	public NotificationServiceImpl(JavaMailSender javaMailSender){
	
		this.javaMailSender=javaMailSender;
	}
	
	@Override
	public void sendNotification(User user){
		
		SimpleMailMessage mail=new SimpleMailMessage();
		mail.setTo(user.getEmailAddress());
		mail.setFrom("amaljames0@gmail.com");
		mail.setSubject("deco Mail");
		mail.setText("this mail is sending using springboot");
		
		javaMailSender.send(mail);
	}

}
