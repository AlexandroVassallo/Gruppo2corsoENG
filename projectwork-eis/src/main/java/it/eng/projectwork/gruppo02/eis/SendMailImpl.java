package it.eng.projectwork.gruppo02.eis;

import javax.ejb.Stateless;


import it.eng.projectwork.gruppo02.model.Message;
import it.eng.projectwork.gruppo02.model.SendMail;

@Stateless
public class SendMailImpl implements SendMail{

	public SendMailImpl() {}

	@Override
	public void sendMailAllUser()  {

			System.out.println("Email inviata");
		
	}

	@Override
	public void sendMail(Message message, String destination){
		
		System.out.println("E-mail Inviata");
		
	};

}
