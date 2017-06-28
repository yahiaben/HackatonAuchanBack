package hackaton.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Recette implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdRecette")
	private Long idRecette;
	
	public String nomRecette;
	
	 @ManyToMany(mappedBy="recettes")
	private List<Produit> produits;

	public Recette(Long idRecette, String nomRecette, List<Produit> produits) {
		super();
		this.idRecette = idRecette;
		this.nomRecette = nomRecette;
		this.produits = produits;
	}
	
	public Recette() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getIdRecette() {
		return idRecette;
	}

	public void setIdRecette(Long idRecette) {
		this.idRecette = idRecette;
	}

	public String getNomRecette() {
		return nomRecette;
	}

	public void setNomRecette(String nomRecette) {
		this.nomRecette = nomRecette;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
	
}
