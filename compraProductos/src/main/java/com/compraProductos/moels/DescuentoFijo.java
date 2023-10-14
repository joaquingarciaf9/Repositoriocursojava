package com.compraProductos.moels;

public class DescuentoFijo extends Descuento {

	@Override
	public double valorFinal(double valorInicial) {
		return valorInicial - this.getValordescuento();
	}
}
