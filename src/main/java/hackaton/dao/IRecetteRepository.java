package hackaton.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import hackaton.entities.Recette;

public interface IRecetteRepository extends JpaRepository<Recette, Long> {

	
}
