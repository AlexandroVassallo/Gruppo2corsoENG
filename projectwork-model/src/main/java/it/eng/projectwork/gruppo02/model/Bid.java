package it.eng.projectwork.gruppo02.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Bid extends AEntity<Long>
{
	//genero gli ID con il sequence
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BID_ID_SEQ") 
	@SequenceGenerator(name="BID_ID_SEQ", sequenceName="BID_ID_SEQ", allocationSize = 1)

	Long oid;
	
	private double prezzoOfferta;
	
	//in questo modo stabilisco che il tempo dell'offerta deve essre calcolato al millesimo
	//@Temporal(TemporalType.DATE)
	Timestamp tempoOfferta;
	

	//relazioni con altre classi
	@ManyToOne
	Auction auction;
	
	@ManyToOne
	User user;
	
	// costruttore default
	 
	public Bid()
	{
		super();
	}

	public Bid(User user, double price, Auction auction){
		this.user = user;
		this.prezzoOfferta = price;
		this.tempoOfferta = new Timestamp(System.currentTimeMillis());
		this.auction=auction;
	}

	@Override
	public Long getOid() {
		return oid;
	}

	
//getters and setters
	
	public void setOid(long oid)
	{
		this.oid=oid;
	}
	
	public double getPrezzoOfferta() {
		return prezzoOfferta;
	}


	public void setPrezzoOfferta(double prezzoOfferta) {
		this.prezzoOfferta = prezzoOfferta;
	}


	public Timestamp getTempoOfferta() {
		return tempoOfferta;
	}


	public void setTempoOfferta(Timestamp tempoOfferta) {
		this.tempoOfferta = tempoOfferta;
	}

	

	
}