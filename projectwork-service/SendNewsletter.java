@Singleton
@Startup
public class SendNewsletter {
	@ejb 
	SendMail sendmail;
//mettiamo dentro sendmail una systemout per capire se funziona
	@Scheduler(minute="0/1", persistent=false)
	public void SendNewsletter()
	{
		sendmail.sendAllUser()
	}
}
