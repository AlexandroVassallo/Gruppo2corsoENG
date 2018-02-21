package it.eng.projectwork.gruppo02.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/*
 * Creo la classe Supplier come estensione di User
 */
@Entity
@Table

public class Supplier extends User
{
	/*
	 * Aggiungo parametri private per l'incapsulamento
	 */
	private String info;
	private int valutation; //TODO da gestire
	
	
	 //Implemento il costruttore di default, come da spericife EntityBean
	 
	public Supplier ()
	{
		
	}
	 //Implemento un altro costruttore
	 
	public Supplier(String username, String nome, String cognome, String email, Address address, String info,int valutation)
	{
		super(username,nome,cognome,email,address);
		this.info=info;
		this.valutation=valutation;
	}
	
	//implemento getters and setters
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getValutation() {
		return valutation;
	}

	public void setValutation(int valutation) {
		this.valutation = valutation;
	}
	

	@Override
	public String toString() {
		return "Supplier [username=" + getUsername() + ", nome=" + getNome() + ", cognome=" + getCognome() + ", email=" + getEmail() + ",info=" + this.info + ", valutation="+ this.valutation+ " ]";
	}
	
	
}
