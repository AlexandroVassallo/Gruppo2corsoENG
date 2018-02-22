package it.eng.projectwork.gruppo02.model;
import javax.persistence.Embeddable;

@Embeddable
public class Address 
{
	private String citta;
	private String via;
	private String numeroCivico;
	private String CAP;
	
	Address() {}
		
	public Address(String citta, String via, String numeroCivico, String CAP) {
		this.citta=citta;
		this.via = via;
		this.numeroCivico = numeroCivico;
		this.CAP = CAP;
	}
	
	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getNumeroCivico() {
		return numeroCivico;
	}
	public void setNumeroCivico(String numeroCivico) {
		this.numeroCivico = numeroCivico;
	}
	public String getCAP() {
		return CAP;
	}
	public void setCAP(String cAP) {
		CAP = cAP;
	}
	
}
