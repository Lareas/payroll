package com.tehilim.aafunc.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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
	
	private static Logger logger = LoggerFactory.getLogger(FuncResource.class);
	
	@Autowired
	private Environment env;
	
	@Autowired
	private FuncRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Func>> findAll() {
		List<Func> list = repository.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Func> findById(@PathVariable Long id) {
		
		logger.info("PORT = " + env.getProperty("local.server.port"));
		
		Func obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
}
