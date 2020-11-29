package com.code.sysPedidos_backend.Entity;

public class Detalle_pedido {
	
	public String idDetalle_pedido;
	public int cantidad;
	public double CostoProd;
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
	public double getCostoProd() {
		return CostoProd;
	}
	public void setCostoProd(double costoProd) {
		CostoProd = costoProd;
	}
	@Override
	public String toString() {
		return "Detalle_pedido [idDetalle_pedido=" + idDetalle_pedido + ", cantidad=" + cantidad + ", CostoProd="
				+ CostoProd + "]";
	}
	
}
