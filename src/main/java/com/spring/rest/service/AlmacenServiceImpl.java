package com.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.dao.IAlmacenDao;
import com.spring.rest.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService{

	@Autowired
	IAlmacenDao iAlmacenDao; 
	
	@Override
	public List<Almacen> listarAlmacenes() {
		// TODO Auto-generated method stub
		return iAlmacenDao.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		// TODO Auto-generated method stub
		return iAlmacenDao.save(almacen);
	}

	@Override
	public Almacen almacenXID(Long codigo) {
		// TODO Auto-generated method stub
		return iAlmacenDao.findById(codigo).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		
		return iAlmacenDao.save(almacen);
	}

	@Override
	public void eliminarAlmacen(Long codigo) {
		// TODO Auto-generated method stub
		iAlmacenDao.deleteById(codigo);
	}


}
