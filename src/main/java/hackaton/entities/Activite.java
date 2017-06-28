package hackaton.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activite implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdActivite")
	private Long idActivite;
	
	private String libelle;
	
	private int calorie60;
	
	private int calorie70;
	
	private int calorie85;

	public Activite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Activite(Long idActivite, String libelle, int calorie60, int calorie70, int calorie85) {
		super();
		this.idActivite = idActivite;
		this.libelle = libelle;
		this.calorie60 = calorie60;
		this.calorie70 = calorie70;
		this.calorie85 = calorie85;
	}

	public Long getIdActivite() {
		return idActivite;
	}

	public void setIdActivite(Long idActivite) {
		this.idActivite = idActivite;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getCalorie60() {
		return calorie60;
	}

	public void setCalorie60(int calorie60) {
		this.calorie60 = calorie60;
	}

	public int getCalorie70() {
		return calorie70;
	}

	public void setCalorie70(int calorie70) {
		this.calorie70 = calorie70;
	}

	public int getCalorie85() {
		return calorie85;
	}

	public void setCalorie85(int calorie85) {
		this.calorie85 = calorie85;
	}

}
