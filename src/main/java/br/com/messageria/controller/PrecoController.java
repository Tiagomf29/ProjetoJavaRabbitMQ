package br.com.messageria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.messageria.contantes.RabbitMqConstantes;
import br.com.messageria.dto.PrecoDTO;
import br.com.messageria.service.PrecoService;

@RestController
@RequestMapping(value = "preco")
public class PrecoController {

	
	@Autowired
	PrecoService precoService;
	
	@PutMapping("enviarPreco")
	private ResponseEntity<PrecoDTO> enviarEstoque(@RequestBody PrecoDTO precoDTO) {
		
		precoService.enviarMensagem(RabbitMqConstantes.FILA_PRECO, precoDTO);
		return ResponseEntity.ok().body(precoDTO);
	}
	
}
