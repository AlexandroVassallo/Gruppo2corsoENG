package it.eng.projectwork.gruppo02.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Product extends AEntity<Long>{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCT_ID_SEQ") 
	@SequenceGenerator(name="PRODUCT_ID_SEQ", sequenceName="PRODUCT_ID_SEQ", allocationSize = 1)
	private Long id;
	private String descrizione;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="product",cascade=CascadeType.ALL)
	private List<Image> images = new ArrayList<>();
	
	public Product(){
		
	}
	
	public Product(String description,List<Image> images) {
		this.descrizione = description;
		setImages(images);
}
	
}
