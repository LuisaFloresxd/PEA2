package Pea2.LuisaFlo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pea2.LuisaFlo.model.GrupoActas;
import Pea2.LuisaFlo.repository.IGrupoActas;

@Service
public class GrupoActasServiceImp implements IGrupoActasService {
	@Autowired 
	IGrupoActas igrupoactas;

	@Override
	public GrupoActas getGrupoActas(String id) {
		
		 return igrupoactas.getGrupoActas(id);
	}
	

}
