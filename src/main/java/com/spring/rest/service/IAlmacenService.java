package com.spring.rest.service;

import java.util.List;

import com.spring.rest.dto.Almacen;

public interface IAlmacenService {

	public List<Almacen> listarAlmacenes();
	
	public Almacen guardarAlmacen(Almacen almacen);
	
	public Almacen almacenXID(Long codigo);
	
	public Almacen actualizarAlmacen(Almacen almacen);
	
	public void eliminarAlmacen(Long codigo);
	
}
