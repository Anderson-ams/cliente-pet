package br.com.petz.clientepet.application.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.petz.clientepet.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@RestController
@Log4j2
public class ClienteController implements ClienteApi {

	private final ClienteService clienteService;

	
	@Override
	public ClienteResponse postCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteController - postCliente");
		ClienteResponse clineteCriado = clienteService.criaCliente(clienteRequest);
		log.info("[finish] ClienteController - postCliente");
		return null;
	}

}
