package it.eng.projectwork.gruppo02.model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.ManyToAny;


@Table
@Entity
public class Auction extends AEntity<Long>{
	
	@Id
	//Impostiamo la stategia con la quale generiamo l'id:Usiamo un contatore
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AUCTION_ID_SEQ")
	//Usiamo un nome diverso per il database
	@SequenceGenerator(name="AUCTION_ID_SEQ",sequenceName="AUCTION_ID_SEQ",allocationSize=1)
	private Long NId;
	
	private String info;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date startAuction;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date endAuction;
	
	//Persist indica che il dato non verrà modificato al variare della riga della tabella Product
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Product product;
	
	@ManyToOne
	private Supplier supplier;
	  
	@OneToMany(mappedBy="auction",cascade=CascadeType.ALL)
	private List<Bid> bids=new ArrayList<Bid>();
	
	//Indica il numero dell'ultima offerta accettata
	@Version
	private long version;
	
	private boolean pause;
	
	
	
	
}
