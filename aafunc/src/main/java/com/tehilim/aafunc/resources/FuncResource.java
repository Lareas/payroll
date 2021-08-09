package com.tehilim.aafunc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tehilim.aafunc.entities.Func;
import com.tehilim.aafunc.repositories.FuncRepository;

@RestController
@RequestMapping(value = "/funcs")
public class FuncResource {
	
	@Autowired
	private FuncRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Func>> findAll() {
		List<Func> list = repository.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Func> findById(@PathVariable Long id) {
		Func obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
}
