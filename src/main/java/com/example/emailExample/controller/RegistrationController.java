package com.example.emailExample.controller;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.emailExample.model.User;
import com.example.emailExample.service.NotificationService;

@RestController
public class RegistrationController {
	
	private org.slf4j.Logger logger=org.slf4j.LoggerFactory.getLogger(RegistrationController.class);
	
	@Autowired
	public NotificationService notificationService;
	
	@RequestMapping("/signup")
	public String signup(){
		return "please signup for our service";
		
	}
	
	@RequestMapping("/signup-success")
	public String signupSuccess(){
		//create user
		User user=new User();
		user.setFirstName("aljo");
		user.setLastName("anto");
		user.setEmailAddress("aljoanto@gmail.com");
		//send a notification
		
		try{
			notificationService.sendNotification(user);
		}
		catch(MailException e){
			
			
			logger.info("error sending email"+e.getMessage());
		}
		return "Thank u for signupwith us";
		
	}
	
	
	
	

}
