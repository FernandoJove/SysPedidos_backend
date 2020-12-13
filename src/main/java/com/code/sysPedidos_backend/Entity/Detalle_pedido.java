package com.code.sysPedidos_backend.Entity;

public class Detalle_pedido {
	
	public String idDetalle_pedido;
	public int cantidad;
	public float costoprod;
	public int idPedidos;
	public int idMenu;
	public String getIdDetalle_pedido() {
		return idDetalle_pedido;
	}
	public void setIdDetalle_pedido(String idDetalle_pedido) {
		this.idDetalle_pedido = idDetalle_pedido;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getCostoprod() {
		return costoprod;
	}
	public void setCostoprod(float costoprod) {
		this.costoprod = costoprod;
	}
	public int getIdPedidos() {
		return idPedidos;
	}
	public void setIdPedidos(int idPedidos) {
		this.idPedidos = idPedidos;
	}
	public int getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}
	
	
	
	
}
