package com.code.sysPedidos_backend.Entity;

import java.sql.Date;

public class Pedido {
	public String idPedido;
	public String fecha_pedido;
	public String direntrega;
	public int estado;
	public int metodocompra;
	public float costototal;
	public int idUsuario;
	public int idEmpresa;
	public String getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}
	public String getFecha_pedido() {
		return fecha_pedido;
	}
	public void setFecha_pedido(String fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}
	public String getDirentrega() {
		return direntrega;
	}
	public void setDirentrega(String direntrega) {
		this.direntrega = direntrega;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getMetodocompra() {
		return metodocompra;
	}
	public void setMetodocompra(int metodocompra) {
		this.metodocompra = metodocompra;
	}
	public float getCostototal() {
		return costototal;
	}
	public void setCostototal(float costototal) {
		this.costototal = costototal;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	
	
	

}
