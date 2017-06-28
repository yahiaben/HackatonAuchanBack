package hackaton.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import hackaton.entities.Activite;

public interface IActiviteRepository extends JpaRepository<Activite, Long>{

	
}
