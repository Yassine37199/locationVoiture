package net.tekup.demo.controller;

import net.tekup.demo.entity.Voiture;
import net.tekup.demo.service.VoitureService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VoitureController {
	
	private VoitureService voitureService;

	public VoitureController(VoitureService voitureService) {
		super();
		this.voitureService = voitureService;
	}
	
	// handler method to handle list VOITURES and return mode and view
	@GetMapping("/voitures")
	public String listVoitures(Model model) {
		model.addAttribute("voitures", voitureService.getAllVoitures());
		return "voitures";
	}
	
	@GetMapping("/voitures/new")
	public String createVoitureForm(Model model) {
		
		// create voiture object to hold student form data
		Voiture voiture = new Voiture();
		model.addAttribute("voiture", voiture);
		return "create_voiture";
		
	}
	
	@PostMapping("/voitures")
	public String saveVoiture(@ModelAttribute("voiture") Voiture voiture) {
		voitureService.saveVoiture(voiture);
		return "redirect:/voitures";
	}
	
	@GetMapping("/voitures/edit/{id}")
	public String editVoitureForm(@PathVariable Long id, Model model) {
		model.addAttribute("voiture", voitureService.getVoitureById(id));
		return "edit_voiture";
	}

	@PostMapping("/voitures/{id}")
	public String updateVoiture(@PathVariable Long id,
			@ModelAttribute("voiture") Voiture voiture,
			Model model) {

		// get voiture from database by id
		Voiture existingVoiture = voitureService.getVoitureById(id);
		existingVoiture.setId(id);
		existingVoiture.setmatricule(voiture.getmatricule());
		existingVoiture.setmodele(voiture.getmodele());
		existingVoiture.setcouleur(voiture.getcouleur());
		
		// save updated student object
		voitureService.updateVoiture(existingVoiture);
		return "redirect:/voitures";
	}
	
	// handler method to handle delete voiture request
	
	@GetMapping("/voitures/{id}")
	public String deleteVoiture(@PathVariable Long id) {
		voitureService.deleteVoitureById(id);
		return "redirect:/students";
	}
	
}
