package it.eng.projectwork.gruppo02.model;

import javax.ejb.Stateless;

import it.eng.projectwork.gruppo02.model.exception.EmailNotSendException;

@Stateless
public class SendMailImpl implements SendMail{

	public SendMailImpl() {}

	@Override
	public void sendMailAllUser(Message message) throws EmailNotSendException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMail(Message message, String destination) throws EmailNotSendException {
		// TODO Auto-generated method stub
		
	};

}
