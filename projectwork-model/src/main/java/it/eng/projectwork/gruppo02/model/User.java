package it.eng.projectwork.gruppo02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private String username;
	
	@Column(name="FIRST_NAME",nullable=false,length=32)
	private String nome;
	
	private String cognome;
	@Column(unique=true)
	private String email;
	
	public User()
	{}

	public User(String username2, String nome2, String cognome2, String email2) {
		// TODO Auto-generated constructor stub
		this.username=username2;
		this.nome=nome2;
		this.cognome=cognome2;
		this.email=email2;
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
	
	
}
