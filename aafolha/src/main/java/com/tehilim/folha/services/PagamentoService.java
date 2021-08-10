package com.tehilim.folha.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tehilim.folha.entities.Func;
import com.tehilim.folha.entities.Pagamento;

@Service
public class PagamentoService {

	@Value("${aafunc.host}")
	private String funcHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Pagamento getPagamento(long funcId, int days) {
		Map<String, String> uriVaribles = new HashMap<>();
		uriVaribles.put("id", ""+funcId);
		
		Func func = restTemplate.getForObject(funcHost + "/funcs/{id}", Func.class, uriVaribles);
		
		return new Pagamento(func.getName(), func.getDailyIncome(), days);
	}
}
