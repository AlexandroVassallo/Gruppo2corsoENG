package it.eng.projectwork.gruppo02.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name="USERX")//lo facciamo perche user è parola chiave
@Entity
@Inheritance(strategy=InheritanceType.JOINED)//definiamo politica di ereditarieta
public class User extends AEntity<String>{
	
	
	@Id
	private String username;
	
	@Column(name="FIRST_NAME",nullable=false,length=32)
	private String nome;
	
	
	private String cognome;
	@Column(unique=true) //l email è come se fosse chaive, ma possiamo cambiarla nel tempo
	private String email;
	
	@Embedded
	private Address address;
	
	public User()
	{}

	public User(String username2, String nome2, String cognome2, String email2, Address address) {
		// TODO Auto-generated constructor stub
		this.username=username2;
		this.nome=nome2;
		this.cognome=cognome2;
		this.email=email2;
		this.address=address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + "]";
	}

	@Override
	@Transient //lo annotiamo perchè è un metodo accessorio che non deve essere mappato
	public String getOid() {
		// TODO Auto-generated method stub
		return username;
	}
	
	
}
