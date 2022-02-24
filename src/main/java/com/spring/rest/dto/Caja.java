package com.spring.rest.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Caja")
public class Caja {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long num_referencia;
	
	private String contenido;
	private int valor;
	
	@ManyToOne
	@JoinColumn(name="codigo_almacen")
	private Almacen almacen;

	public Caja() {
	}

	public Caja(Long num_referencia, String contenido, int valor, Almacen almacen) {
		this.num_referencia = num_referencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	public Long getNum_referencia() {
		return num_referencia;
	}

	public void setNum_referencia(Long num_referencia) {
		this.num_referencia = num_referencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Caja [num_referencia=" + num_referencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + "]";
	}
	
	
	
}