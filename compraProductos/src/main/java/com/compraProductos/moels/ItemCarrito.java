package com.compraProductos.moels;


public class ItemCarrito {
	private Double cantidad;
	private Producto producto;
	

public ItemCarrito(Producto producto, Double cantidad) {
	this.setProducto(producto);
	this.setCantidad(cantidad);
}	
	
	
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public Double precio() {
		return this.getProducto().getPrecio()*this.getCantidad();
	}
}
