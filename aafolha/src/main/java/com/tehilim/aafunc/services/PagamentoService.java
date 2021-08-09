package com.tehilim.aafunc.services;

import org.springframework.stereotype.Service;

import com.tehilim.aafunc.entities.Pagamento;

@Service
public class PagamentoService {

	public Pagamento getPagamento(long funcId, int days) {
		return new Pagamento("Bob", 200.0, days);
	}
}
