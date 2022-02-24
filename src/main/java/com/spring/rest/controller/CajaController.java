package com.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.dto.Caja;
import com.spring.rest.service.CajaServiceImpl;

@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServiceImpl cajaServiceImpl;
	
	@GetMapping("/cajas")
	public List<Caja> listarCajas() {
		return cajaServiceImpl.listarCajas();
	}
	
	@PostMapping("/cajas")
	public Caja guardarCaja(@RequestBody Caja caja) {
		
		return cajaServiceImpl.guardarCaja(caja);
	}
	
	@GetMapping("/cajas/{id}")
	public Caja cajaXID(@PathVariable(name = "id") Long num_referencia) {
		
		return cajaServiceImpl.cajaXID(num_referencia);
	}
	
	@PutMapping("/cajas/{id}")
	public Caja actualizarCaja(@PathVariable(name = "id") Long num_referencia, @RequestBody Caja caja) {
		
		Caja caja_seleccionada = new Caja();
		Caja caja_actualizada = new Caja();
		
		caja_seleccionada = cajaServiceImpl.cajaXID(num_referencia);
		
		caja_seleccionada.setContenido(caja.getContenido());
		caja_seleccionada.setValor(caja.getValor());
		caja_seleccionada.setAlmacen(caja.getAlmacen());
		
		caja_actualizada = cajaServiceImpl.actualizarCaja(caja_seleccionada);
		
		return caja_actualizada;
		
	}
	
	@DeleteMapping("/cajas/{id}")
	public void eliminarCaja(@PathVariable(name="id") Long num_referencia) {
		cajaServiceImpl.eliminarCaja(num_referencia);
	}
	
}
