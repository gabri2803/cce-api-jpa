package it.objectmethod.cceapijpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.objectmethod.cceapijpa.entity.Comune;

@Repository
public interface ComuneRepo extends JpaRepository<Comune, Long> {
	List<Comune> findAllByProvincia(String nomProv);

	@Query("SELECT DISTINCT c.provincia FROM Comune c WHERE c.regione= ?1")
	List<String> findProvinceByRegione(String regione);

	@Query("SELECT DISTINCT c.regione FROM Comune c")
	List<String> getAllRegione();

}
