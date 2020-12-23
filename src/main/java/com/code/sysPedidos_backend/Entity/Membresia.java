package com.code.sysPedidos_backend.Entity;

import java.sql.Date;

public class Membresia {
	
	public String idMembresia;
	public Date fecha_inicio;
	public Date fecha_fin;
	public String getIdMembresia() {
		return idMembresia;
	}
	public void setIdMembresia(String idMembresia) {
		this.idMembresia = idMembresia;
	}
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public Date getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	
}
