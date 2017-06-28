package hackaton.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;


@Entity
public class Produit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cug")
	private Long cug;
	
	private String product_name;
	
	private int calories;
	
	private double national_price;
	
	private String label;
	
	private String ean;
	
	private String attribute_value;
	
    @ManyToMany(cascade={CascadeType.ALL})
    @JoinTable(
    	      name="PRODUIT_RECETTE",
    	      joinColumns=@JoinColumn(name="CUG_ID", referencedColumnName="cug"),
    	      inverseJoinColumns=@JoinColumn(name="RECETTE_ID", referencedColumnName="IdRecette"))
	private Collection<Recette> recettes;

    
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Produit(Long cug, String product_name, int calories, double national_price, String label, String ean,
			String attribute_value, Collection<Recette> recettes) {
		super();
		this.cug = cug;
		this.product_name = product_name;
		this.calories = calories;
		this.national_price = national_price;
		this.label = label;
		this.ean = ean;
		this.attribute_value = attribute_value;
		this.recettes = recettes;
	}


	public Long getCug() {
		return cug;
	}


	public void setCug(Long cug) {
		this.cug = cug;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public int getCalories() {
		return calories;
	}


	public void setCalories(int calories) {
		this.calories = calories;
	}


	public double getNational_price() {
		return national_price;
	}


	public void setNational_price(double national_price) {
		this.national_price = national_price;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public String getEan() {
		return ean;
	}


	public void setEan(String ean) {
		this.ean = ean;
	}


	public String getAttribute_value() {
		return attribute_value;
	}


	public void setAttribute_value(String attribute_value) {
		this.attribute_value = attribute_value;
	}


	public Collection<Recette> getRecettes() {
		return recettes;
	}


	public void setRecettes(Collection<Recette> recettes) {
		this.recettes = recettes;
	}
	
	
	
	
}
