package it.eng.projectwork.gruppo02.model;

import javax.ejb.Local;

import it.eng.projectwork.gruppo02.model.exception.EmailNotSendException;

@Local
public interface SendMail {
	
	public void sendMailAllUser(Message message)throws EmailNotSendException;
	public void sendMail(Message message, String destination) throws EmailNotSendException;

}
