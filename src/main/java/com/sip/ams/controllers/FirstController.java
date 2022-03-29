package com.sip.ams.controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sip.ams.entities.Etudiant;

@Controller 
public class FirstController {
	static ArrayList<Etudiant> students = new ArrayList();
	static {
		
		
		students.add(new Etudiant("Mohamed",25 , "99568326","Tunis") );
		students.add(new Etudiant("Salah",25 , "21526354","Nabeul") );
		students.add(new Etudiant("Ali",25 , "23653294","Tunis") );
		students.add(new Etudiant("Sadok",25 , "98456235","Tunis") );
		
	}
	
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
		
		m.addAttribute("students",students);
		return "home/etudiant";
	}
	
	@RequestMapping("/add")
	public String add_etudiant(Model m) {
		return "home/addstudiant";
	}
	
	@PostMapping("/save")
	//@ResponseBody
	public String save_etudiant(
			@RequestParam("nom")String nom,
			@RequestParam("age")int age,
			@RequestParam("tel")String tel,
			@RequestParam("adr")String adr) {
		
		
		Etudiant et=new Etudiant(nom,age,tel,adr);
		
		students.add(et);
		
		return "redirect:/list";
	}
	
	@GetMapping("/delete/{tel}")
	//@ResponseBody
	public String delete_etudiant(@PathVariable("tel")String tel) {
		Etudiant temp=null;
		
		for(Etudiant e: students) {
		  if(e.getTel().equals( tel) ) {
			  temp=e;
		  }	
		}
		
		System.out.println(students);
		students.remove(temp);
		
		return "redirect:../list";
	}
	
	
}





















