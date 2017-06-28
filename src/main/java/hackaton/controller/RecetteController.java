package hackaton.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hackaton.dao.IRecetteRepository;
import hackaton.entities.Recette;

@RestController
public class RecetteController {

	@Autowired
	private IRecetteRepository recetteRepository;
	
	@RequestMapping("/saveRecette")
	public Recette saveProduit(Recette r){
		recetteRepository.save(r);
		return r;
	}
	
	@RequestMapping("/allRecettes")
	public List<Recette> getRecettes(){
		return recetteRepository.findAll();
	}
}
