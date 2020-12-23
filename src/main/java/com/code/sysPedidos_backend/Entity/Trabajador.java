package com.code.sysPedidos_backend.Entity;

public class Trabajador {
	
	public int idtrabajador;
	public int idempresa;
	public int idrol;
	public int idusuario;
	public int estado;
	public String DNI;
	public String username;
	public String nomrol;
	public String nomempresa;
	public Trabajador() {
		
	}
	public Trabajador(int idtrabajador, int idempresa, int idrol, int idusuario, int estado, String dNI,
			String username, String nomrol, String nomempresa) {
		
		this.idtrabajador = idtrabajador;
		this.idempresa = idempresa;
		this.idrol = idrol;
		this.idusuario = idusuario;
		this.estado = estado;
		DNI = dNI;
		this.username = username;
		this.nomrol = nomrol;
		this.nomempresa = nomempresa;
	}
	public int getIdtrabajador() {
		return idtrabajador;
	}
	public void setIdtrabajador(int idtrabajador) {
		this.idtrabajador = idtrabajador;
	}
	public int getIdempresa() {
		return idempresa;
	}
	public void setIdempresa(int idempresa) {
		this.idempresa = idempresa;
	}
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNomrol() {
		return nomrol;
	}
	public void setNomrol(String nomrol) {
		this.nomrol = nomrol;
	}
	public String getNomempresa() {
		return nomempresa;
	}
	public void setNomempresa(String nomempresa) {
		this.nomempresa = nomempresa;
	}
	
	
	
}
