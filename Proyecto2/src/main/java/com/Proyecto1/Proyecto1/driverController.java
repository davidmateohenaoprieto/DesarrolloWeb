package com.Proyecto1.Proyecto1;

import com.Proyecto1.Proyecto1.model.asignacionBuses;
import com.Proyecto1.Proyecto1.service.conductorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import com.Proyecto1.Proyecto1.model.*;

@Controller
@RequestMapping("/driver")
public class driverController {


	@Autowired
	private conductorService conductorService;

	@GetMapping("/list")
	public String listarCond(Model model){
		List<Conductor> conductores=conductorService.listarConductores();
		model.addAttribute("drivers",conductores);
		return "list-driver";
	}


	/*@GetMapping("/busesAsignados")
	public String busesAsignados(){
		return "instruccion1";
	}*/

	/*
		@GetMapping("/busesAsignados")
		public String mostrarRutas(Model model){
			model.AddAtribute("nombreDeVariable","dato a imprimir o mandar al html")
			return "instruccion1";
		}

	*/

	/*
		pagina que muestra un listado de cosas
		debo crar una base de datos y las otras entidades
		@Autowired
		database db;

		Collection<Person>persons=db.findAll()
		model.addAtribute("persons",persons)
		return "persons-list"// Nombre de la plantilla
	*/




}
