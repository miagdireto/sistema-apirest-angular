package com.sistema.apirest.resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import com.sistema.apirest.models.Historico;
import com.sistema.apirest.repository.HistoricoRepository;



@RestController
@RequestMapping(value="/api")
@Api(value="API REST Historico")
@CrossOrigin(origins="*")
public class HistoricoResource {
	
	@Autowired
	HistoricoRepository historicoRepository;
	
	@GetMapping("/historicos")
	@ApiOperation(value="Retorna uma lista de Historico")
	public List<Historico> listaHistoricos(){
		return historicoRepository.findAll();
	}
	
	@GetMapping("/historico/{id}")
	@ApiOperation(value="Retorna um Historico por id")
	public Historico listaHistorico(@PathVariable(value="id") long id){
		return historicoRepository.findById(id);
		
	}	
	
	@PostMapping("/historico")
	@ApiOperation(value="Salva um Historico")
	public Historico salvaHistorico(@RequestBody Historico historico){
	    return historicoRepository.save(historico);
    }
	
	@DeleteMapping("/historico")
	@ApiOperation(value="Deleta um Historico")
	public void deletaHistorico(@RequestBody Historico historico){
	    historicoRepository.delete(historico);
    }
	
	@PutMapping("/historico")
	@ApiOperation(value="Atualiza um Historico")
	public void atualizaHistorico(@RequestBody Historico historico){
	    historicoRepository.save(historico);
	}
	
	
	

}
