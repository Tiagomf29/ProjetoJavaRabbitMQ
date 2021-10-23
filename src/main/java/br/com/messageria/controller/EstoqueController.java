package br.com.messageria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.messageria.contantes.RabbitMqConstantes;
import br.com.messageria.dto.EstoqueDTO;
import br.com.messageria.service.EstoqueService;

@RestController
@RequestMapping(value = "estoque")
public class EstoqueController {

	@Autowired
	EstoqueService estoqueService;
	
	@PutMapping("enviarEstoque")
	private ResponseEntity<EstoqueDTO> enviarEstoque(@RequestBody EstoqueDTO estoqueDTo) {
		
		this.estoqueService.enviaMensagem(RabbitMqConstantes.FILA_ESTOQUE, estoqueDTo);
		
		return ResponseEntity.ok().body(estoqueDTo);
	}
	
}
