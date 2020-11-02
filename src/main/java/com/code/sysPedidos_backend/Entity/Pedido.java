package com.code.sysPedidos_backend.Entity;

import java.sql.Date;

public class Pedido {
	public String idPedido;
	public Date fecha_pedido;
	public String DirEntrega;
	public int estado;
	public int MetodoCompra;
	public double CostoTotal;
	public String getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}
	public Date getFecha_pedido() {
		return fecha_pedido;
	}
	public void setFecha_pedido(Date fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}
	public String getDirEntrega() {
		return DirEntrega;
	}
	public void setDirEntrega(String dirEntrega) {
		DirEntrega = dirEntrega;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getMetodoCompra() {
		return MetodoCompra;
	}
	public void setMetodoCompra(int metodoCompra) {
		MetodoCompra = metodoCompra;
	}
	public double getCostoTotal() {
		return CostoTotal;
	}
	public void setCostoTotal(double costoTotal) {
		CostoTotal = costoTotal;
	}
	
	

}
