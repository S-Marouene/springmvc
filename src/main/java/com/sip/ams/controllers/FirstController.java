package com.sip.ams.controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sip.ams.entities.Etudiant;

@Controller 
public class FirstController {
	
	@RequestMapping("/first")
	public String home(Model m) {
		
		String nom="maro";
		String universite="Université centrale";
		
		String email="Université@centrale";
		
		m.addAttribute("name",nom);
		m.addAttribute("universite",universite);
		m.addAttribute("email",email);
		
		ArrayList<String> cours = new ArrayList<>();

		cours.add("JAVA OCA");
		cours.add("OCP");
		cours.add("SpringBoot");
		cours.add("Micro Service");
		
		m.addAttribute("cours",cours);

		
		
		return "home/app";
	}
	
	@RequestMapping("/list")
	public String etudiants(Model m) {
		
		ArrayList<Etudiant> students = new ArrayList();
		
		students.add(new Etudiant("Mohamed",25 , "99568326","Tunis") );
		students.add(new Etudiant("Salah",25 , "21526354","Nabeul") );
		students.add(new Etudiant("Ali",25 , "23653294","Tunis") );
		students.add(new Etudiant("Sadok",25 , "98456235","Tunis") );
		m.addAttribute("students",students);
		return "home/etudiant";
	}
	
	@RequestMapping("/add")
	public String add_etudiant(Model m) {
		return "home/addstudiant";
	}
	
}
