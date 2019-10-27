package mx.sft.qm.atm;

import mx.sft.qm.atm.config.Mensaje;
import mx.sft.qm.atm.model.Cuenta;
import mx.sft.qm.atm.security.CodeDecode;
import mx.sft.qm.atm.service.CuentaService;
import mx.sft.qm.atm.service.impl.CuentaServiceImpl;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaService cuentaService=new CuentaServiceImpl();
		Cuenta cuenta=new Cuenta();
		
		 cuenta.setNumeroTarjeta("1234567895623478");
		 cuenta.setNip(CodeDecode.code("9741"));
		 cuenta.setSaldo(1579.50);
		 cuenta.setStatu(true);
		 
		 try {
			 if(cuentaService.crear(cuenta))
			 System.out.println(Mensaje.MSGCREADO+" "+cuenta.toString());
		 }catch (Exception e) {
			// TODO: handle exception
			 System.err.println(Mensaje.MSGERRORCREAR+" "+cuenta.toString());
			 
		}
		

	}

}
