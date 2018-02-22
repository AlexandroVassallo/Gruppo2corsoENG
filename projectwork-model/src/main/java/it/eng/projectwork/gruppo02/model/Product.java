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
	private Long oid;
	private String descrizione;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="product",cascade=CascadeType.ALL)
	private List<Image> images = new ArrayList<Image>();
	
	public Product(){
		
	}
	
	public Product(String descrizione,List<Image> images) {
		this.descrizione = descrizione;
		setImages(images);
}
	
	public Long getOid() {
		return oid;
	}
	
	public void setOid(Long oid) {
		this.oid = oid;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public List<Image> getImages() {
		return images;
	}
	
	public void setImages(List<Image> images) {
		this.images = images;
		if(this.images!=null){
			this.images.forEach((e)->{e.setProduct(this);});
		}
	}

	@Override
	public String toString() {
		return "Supplier [getOid()=" + getOid() + ", getDescription()=" + getDescrizione() + super.toString() + "]";
}
	
}
