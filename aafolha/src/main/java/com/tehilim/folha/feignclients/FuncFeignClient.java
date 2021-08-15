package com.tehilim.folha.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tehilim.folha.entities.Func;


@Component
@FeignClient(name = "aafunc", url = "localhost:8001", path = "/funcs")
public interface FuncFeignClient {
	
	@GetMapping(value = "/{id}")
	ResponseEntity<Func> findById(@PathVariable Long id);

}
