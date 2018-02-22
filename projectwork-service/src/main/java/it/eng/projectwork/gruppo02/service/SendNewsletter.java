package it.eng.projectwork.gruppo02.service;

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

//mettiamo dentro sendmail una systemout per capire se funziona
	@Schedule(minute="0/1", persistent=false)
	public void SendNewsletter()
	{
		sendMail.sendMailAllUser();
	}
}
