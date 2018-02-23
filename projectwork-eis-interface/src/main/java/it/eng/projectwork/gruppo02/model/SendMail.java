package it.eng.projectwork.gruppo02.model;

import javax.ejb.Local;

@Local
public interface SendMail {
	//modifico momentaneamente i paramentri di sentmailall , al posto di message non metto niente, ho levato l exception
	public void sendMailAllUser();
	public void sendMail(Message message, String destination);

}
