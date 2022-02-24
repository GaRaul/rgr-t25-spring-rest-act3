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

import com.spring.rest.dto.Almacen;
import com.spring.rest.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {

	@Autowired
	AlmacenServiceImpl almacenServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacenes() {
		
		return almacenServiceImpl.listarAlmacenes();
		
	}
	
	@PostMapping("/almacenes")
	public Almacen guardarAlmacen(@RequestBody Almacen almacen) {
		
		return almacenServiceImpl.guardarAlmacen(almacen);
		
	}
	
	@GetMapping("/almacenes/{id}")
	public Almacen almacenXID(@PathVariable(name = "id") Long codigo) {
		
		Almacen almacenXID = new Almacen();
		
		almacenXID = almacenServiceImpl.almacenXID(codigo);
		
		return almacenXID;
		
	}
	
	@PutMapping("/almacenes/{id}")
	public Almacen actualizarAlmacen(@PathVariable(name = "id")Long codigo, @RequestBody Almacen almacen) {
		
		Almacen almacen_seleccionado = new Almacen();
		Almacen almacen_actualizado = new Almacen();
		
		almacen_seleccionado = almacenServiceImpl.almacenXID(codigo);
		
		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());
		almacen_seleccionado.setCajas(almacen.getCajas());
		
		almacen_actualizado = almacenServiceImpl.actualizarAlmacen(almacen_seleccionado);
		
		return almacenServiceImpl.actualizarAlmacen(almacen_actualizado);
		
	}
	
	@DeleteMapping("/almacenes/{id}")
	public void eliminarAlmacen(@PathVariable(name = "id") Long codigo) {
		
		almacenServiceImpl.eliminarAlmacen(codigo);
	}
	
}
