package net.tekup.demo.service;

import java.util.List;

import net.tekup.demo.entity.Voiture;
import net.tekup.demo.service.VoitureService;
import org.springframework.stereotype.Service;

import net.tekup.demo.repository.VoitureRepository;

@Service
public class VoitureServiceImpl implements VoitureService {

	private VoitureRepository voitureRepository;
	
	public VoitureServiceImpl(VoitureRepository voitureRepository) {
		super();
		this.voitureRepository = voitureRepository;
	}

	@Override
	public List<Voiture> getAllVoitures() {
		return voitureRepository.findAll();
	}

	@Override
	public Voiture saveVoiture(Voiture voiture) {
		return voitureRepository.save(voiture);
	}

	@Override
	public Voiture getVoitureById(Long id) {
		return voitureRepository.findById(id).get();
	}

@Override
	public Voiture updateVoiture(Voiture voiture) {
		return voitureRepository.save(voiture);
	}

@Override
	public void deleteVoitureById(Long id) {
		voitureRepository.deleteById(id);
	}

}
