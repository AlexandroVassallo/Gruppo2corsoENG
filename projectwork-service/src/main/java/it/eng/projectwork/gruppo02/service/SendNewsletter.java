package it.eng.projectwork.gruppo02.service;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import it.eng.projectwork.gruppo02.model.SendMail;

@Singleton
@Startup
public class SendNewsletter {
	
	@EJB
	SendMail sendMail;
	
	
	@PostConstruct
	public void testInit() {
		System.out.println("test inti");
	}

	public void sendMailAllUser(){
		System.out.print("EMAIL INVIATA");
	}
	
	@Schedule(second="*",persistent=false)
	public void sendNewsletter()
	{
		sendMail.sendMailAllUser();
		
	}
	

	
//mettiamo dentro sendmail una systemout per capire se funziona

	
	
	
}
