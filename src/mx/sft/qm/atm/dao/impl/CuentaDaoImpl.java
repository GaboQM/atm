package mx.sft.qm.atm.dao.impl;

import java.util.List;

import mx.sft.qm.atm.config.DataRutas;
import mx.sft.qm.atm.dao.CuentaDao;
import mx.sft.qm.atm.model.Cuenta;
import mx.sft.qm.atm.util.LeerEscribirData;

public class CuentaDaoImpl implements CuentaDao{

	@Override
	public boolean crear(Cuenta cuenta) {
		// TODO Auto-generated method stub
		return LeerEscribirData.escribir(DataRutas.RUTA_CUENTA_DB, cuenta.toString());
	}

	@Override
	public Cuenta cuentaPorNumTarjeta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cuenta actualizarCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cuenta> listarCuenta() {
		// TODO Auto-generated method stub
		return null;
	}

}
