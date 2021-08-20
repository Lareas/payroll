package com.tehilim.folha.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tehilim.folha.entities.Pagamento;
import com.tehilim.folha.services.PagamentoService;

@RestController
@RequestMapping(value = "/pagto")
public class PagamentoResources {
	
	@Autowired
	private PagamentoService service;
	
	@GetMapping(value = "/{funcId}/days/{days}") 
	public ResponseEntity<Pagamento> getPagto(@PathVariable Long funcId, 
			@PathVariable Integer days) {
		Pagamento pagamento = service.getPagamento(funcId, days);
		return ResponseEntity.ok(pagamento);
	}
	
}
