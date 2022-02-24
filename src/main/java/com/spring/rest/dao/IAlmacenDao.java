package com.spring.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.dto.Almacen;

public interface IAlmacenDao extends JpaRepository<Almacen, Long>{
	
}
