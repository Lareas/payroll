package com.tehilim.folha.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tehilim.folha.entities.Func;
import com.tehilim.folha.entities.Pagamento;
import com.tehilim.folha.feignclients.FuncFeignClient;

@Service
public class PagamentoService {

	@Autowired
	private FuncFeignClient funcFeignClient;
	
	public Pagamento getPagamento(long funcId, int days) {
		
		Func func = funcFeignClient.findById(funcId).getBody();
		return new Pagamento(func.getName(), func.getDailyIncome(), days);
	}
}
