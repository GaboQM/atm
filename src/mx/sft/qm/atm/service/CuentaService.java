package mx.sft.qm.atm.service;

import java.util.List;

import mx.sft.qm.atm.model.Cuenta;

public interface CuentaService {
public boolean crear(Cuenta cuenta);
	
	public Cuenta cuentaPorNumTarjeta(Cuenta cuenta);
	
	public Cuenta actualizarCuenta(Cuenta cuenta);
	
	public List<Cuenta> listarCuenta();
	

}
