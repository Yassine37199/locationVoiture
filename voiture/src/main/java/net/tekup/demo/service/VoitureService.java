package net.tekup.demo.service;

import java.util.List;

import net.tekup.demo.entity.Voiture;

public interface VoitureService {
	List<Voiture> getAllVoitures();
	
	Voiture saveVoiture(Voiture voiture);
	
	Voiture getVoitureById(Long id);
	
	Voiture updateVoiture(Voiture voiture);
	
	void deleteVoitureById(Long id);
}
