package Pea2.LuisaFlo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Pea2.LuisaFlo.model.GrupoActas;

@Repository


public interface IGrupoActas extends JpaRepository<GrupoActas, String>{ 
	@Query (value="{call usp_getGrupoVotacion(:id)}",nativeQuery = true)
	GrupoActas getGrupoActas(String id); 
	
}
