package Pea2.LuisaFlo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.config.CorsRegistry;

import Pea2.LuisaFlo.service.IGrupoActasService;


@Configuration 
@CrossOrigin
@Controller
public class ActasController {
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/actas")
	public String actas() {
		return "actas";
	}
	@Autowired
	private IGrupoActasService IGrupoActasService;
	
	
	
	
	@RequestMapping("/actas_desarrolladas")
	public String listaractas(Model modelo ,@RequestParam("nroMesa") String nroMesa){
		modelo.addAttribute("actas", IGrupoActasService.getGrupoActas(nroMesa));
	    return "actas_desarrolladas";
	}

}
