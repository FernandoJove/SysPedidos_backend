package com.code.sysPedidos_backend.Entity;

public class Rol {
	public int idrol;
	public String nomrol;
	public int estado;
	public Rol() {
		
	}
	public Rol(int idrol, String nomrol, int estado) {
		
		this.idrol = idrol;
		this.nomrol = nomrol;
		this.estado = estado;
	}
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	public String getNomrol() {
		return nomrol;
	}
	public void setNomrol(String nomrol) {
		this.nomrol = nomrol;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
}
