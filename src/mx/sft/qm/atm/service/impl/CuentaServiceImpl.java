package mx.sft.qm.atm.service.impl;

import java.util.List;

import mx.sft.qm.atm.dao.CuentaDao;
import mx.sft.qm.atm.dao.impl.CuentaDaoImpl;
import mx.sft.qm.atm.model.Cuenta;
import mx.sft.qm.atm.service.CuentaService;

public class CuentaServiceImpl implements CuentaService {
	
	private  CuentaDao cuentaDao;

	@Override
	public boolean crear(Cuenta cuenta) {
		cuentaDao=new CuentaDaoImpl();
		return cuentaDao.crear(cuenta);
	}

	@Override
	public Cuenta cuentaPorNumTarjeta(Cuenta cuenta) {
		cuentaDao=new CuentaDaoImpl();
		return cuentaDao.cuentaPorNumTarjeta(cuenta);
	}

	@Override
	public Cuenta actualizarCuenta(Cuenta cuenta) {
		cuentaDao=new CuentaDaoImpl();
		return cuentaDao.actualizarCuenta(cuenta);
	}

	@Override
	public List<Cuenta> listarCuenta() {
		cuentaDao=new CuentaDaoImpl();
		return cuentaDao.listarCuenta();
	}

}
