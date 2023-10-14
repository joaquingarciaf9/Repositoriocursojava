package com.compraProductos.moels;

public class DescuentoPorcentaje extends Descuento{

	@Override
	public double valorFinal(double valorInicial) {
		return valorInicial -(valorInicial*this.getValordescuento());
	}

		
}
