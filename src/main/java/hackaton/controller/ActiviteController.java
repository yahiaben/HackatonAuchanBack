package hackaton.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hackaton.dao.IActiviteRepository;
import hackaton.entities.Activite;

@RestController
public class ActiviteController {


	@Autowired
	private IActiviteRepository activiteRepository;
	
	@RequestMapping("/getActivite")
	public Activite getActivite(Long ref){
		return activiteRepository.findOne(ref);
	}
	
	@RequestMapping("/allActivites")
	public List<Activite> getActivites(){
		return activiteRepository.findAll();
	}
}
