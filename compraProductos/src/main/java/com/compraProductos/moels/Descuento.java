package com.compraProductos.moels;

import java.time.LocalDate;

public abstract class Descuento {
	private LocalDate comienzo;
	private LocalDate fin;
	private Double valor;
	
	
	public Double getValordescuento() {
		return valor;
	}

	public void setValordescuento(Double valor) {
		this.valor= valor;
	}
	public abstract double valorFinal(double valorInicial);
}
