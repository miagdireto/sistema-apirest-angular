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
import com.sistema.apirest.models.Usuario;
import com.sistema.apirest.repository.UsuarioRepository;


@RestController
@RequestMapping(value="/api")
@Api(value="API REST Usuario")
@CrossOrigin(origins="*")
public class UsuarioResource {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	@ApiOperation(value="Retorna uma lista de Usuarios")
	public List<Usuario> listaUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/usuario/{id}")
	@ApiOperation(value="Retorna um Usuario por id")
	public Usuario listaUsuario(@PathVariable(value="id") long id){
		return usuarioRepository.findById(id);
		
	}	
	
	@PostMapping("/usuario")
	@ApiOperation(value="Salva o Usuario")
	public Usuario salvaUsuario(@RequestBody Usuario usuario){
	    return usuarioRepository.save(usuario);
    }
	
	@DeleteMapping("/usuario")
	@ApiOperation(value="Deleta o Usuario")
	public void deletaUsuario(@RequestBody Usuario usuario){
	    usuarioRepository.delete(usuario);
    }
	
	@PutMapping("/usuario")
	@ApiOperation(value="Atualiza um usuario")
	public void atualizaUsuario(@RequestBody Usuario usuario){
	    usuarioRepository.save(usuario);
	}
	
	

}
