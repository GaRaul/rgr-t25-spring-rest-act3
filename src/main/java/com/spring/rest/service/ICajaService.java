package com.spring.rest.service;

import java.util.List;

import com.spring.rest.dto.Caja;

public interface ICajaService {

	public List<Caja> listarCajas();
	
	public Caja guardarCaja(Caja caja);
	
	public Caja cajaXID(Long num_referencia);
	
	public Caja actualizarCaja(Caja caja);
	
	public void eliminarCaja(Long num_referencia);
	
}
