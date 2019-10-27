package mx.sft.qm.atm.model;

public class Cuenta {
	private String numeroTarjeta;
	private String nip;
	private  double saldo;
	private boolean statu;
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatu() {
		return statu;
	}
	public void setStatu(boolean statu) {
		this.statu = statu;
	}
	@Override
	public String toString() {
		return "Cuenta [numeroTarjeta=" + numeroTarjeta + ", nip=" + nip + ", saldo=" + saldo + ", statu=" + statu
				+ "]";
	}	
	
	
}
