package com.sistema.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sistema.apirest.models.Historico;

public interface HistoricoRepository extends JpaRepository<Historico, Long> {

	Historico findById(long id); 
	
}
