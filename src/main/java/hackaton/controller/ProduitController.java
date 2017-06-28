package hackaton.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hackaton.dao.IProduitRepository;
import hackaton.entities.Produit;

@RestController
public class ProduitController {
	
	private static int SIZE = 2;
	@Autowired
	private IProduitRepository produitRepository;
	
	@RequestMapping("/saveProduit")
	public Produit saveProduit(Produit p){
		produitRepository.save(p);
		return p;
	}
	
	@RequestMapping("/allProduits")
	public List<Produit> getProduits(){
		return produitRepository.findAll();
	}
	
	@RequestMapping("/allProduitsByPage")
	public Page<Produit> getProduits(int page){
		return produitRepository.findAll(new PageRequest(page, SIZE));
	}
	
	@RequestMapping("/produitsParMC")
	public Page<Produit> getProduits(String mc, int page){
		return produitRepository.produitParMC("%"+mc+"%",new PageRequest(page, SIZE));
	}
	
	@RequestMapping("/getProduit")
	public Produit getProduit(Long ref){
		return produitRepository.findOne(ref);
	}
	
	@RequestMapping("/deleteProduit")
	public boolean deleteProduit(Long ref){
		produitRepository.delete(ref);
		return true;
	}
}
