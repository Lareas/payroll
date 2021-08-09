package com.tehilim.aafunc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tehilim.aafunc.entities.Func;

public interface FuncRepository extends JpaRepository<Func, Long> {

}
