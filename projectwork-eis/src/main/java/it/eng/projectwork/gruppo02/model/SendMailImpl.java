package it.eng.projectwork.gruppo02.model;

import javax.ejb.Stateless;

import it.eng.projectwork.gruppo02.model.exception.EmailNotSendException;

@Stateless
public class SendMailImpl implements SendMail{

	public SendMailImpl() {}

	@Override
	public void sendMailAllUser()  {

			System.out.println("Email inviata");
		
	}

	@Override
	public void sendMail(Message message, String destination) throws EmailNotSendException {
		
		System.out.println("E-mail Inviata");
		
	};

}
