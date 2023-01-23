package net.tekup.demo.repository;

import net.tekup.demo.entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture, Long>{

}
