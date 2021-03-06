package co.edu.campusucc.sd.modelo;
// Generated 15-abr-2020 13:24:18 by Hibernate Tools 5.4.7.Final

import java.math.BigInteger;

/**
 * Biometria generated by hbm2java
 */
public class Biometria implements java.io.Serializable {

	private BigInteger idBiometria;
	private Cliente cliente;
	private byte[] huella01;

	public Biometria() {
	}

	public Biometria(BigInteger idBiometria) {
		this.idBiometria = idBiometria;
	}

	public Biometria(BigInteger idBiometria, Cliente cliente, byte[] huella01) {
		this.idBiometria = idBiometria;
		this.cliente = cliente;
		this.huella01 = huella01;
	}

	public BigInteger getIdBiometria() {
		return this.idBiometria;
	}

	public void setIdBiometria(BigInteger idBiometria) {
		this.idBiometria = idBiometria;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public byte[] getHuella01() {
		return this.huella01;
	}

	public void setHuella01(byte[] huella01) {
		this.huella01 = huella01;
	}

}
