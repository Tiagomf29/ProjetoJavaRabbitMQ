package br.com.messageria.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrecoService {

	
	@Autowired
	RabbitTemplate rabbitTemplate;
	
	public void enviarMensagem(String nomeFila, Object mensagem) {
		
		rabbitTemplate.convertAndSend(nomeFila, mensagem);
		
	}
	
}
