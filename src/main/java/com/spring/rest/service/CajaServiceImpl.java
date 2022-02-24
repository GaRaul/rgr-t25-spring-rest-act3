package com.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.dao.ICajaDao;
import com.spring.rest.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService{

	@Autowired
	ICajaDao iCajaDao;

	@Override
	public List<Caja> listarCajas() {
		// TODO Auto-generated method stub
		return iCajaDao.findAll();
	}

	@Override
	public Caja guardarCaja(Caja caja) {
		// TODO Auto-generated method stub
		return iCajaDao.save(caja);
	}

	@Override
	public Caja cajaXID(Long num_referencia) {
		// TODO Auto-generated method stub
		return iCajaDao.findById(num_referencia).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		// TODO Auto-generated method stub
		return iCajaDao.save(caja);
	}

	@Override
	public void eliminarCaja(Long num_referencia) {
		// TODO Auto-generated method stub
		iCajaDao.deleteById(num_referencia);
	}

}
