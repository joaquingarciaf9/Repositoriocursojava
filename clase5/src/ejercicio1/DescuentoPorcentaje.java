package ejercicio1;

public class DescuentoPorcentaje extends Descuento {

	@Override
	public double valorFinal(double valorInicial) {
		return valorInicial -(valorInicial*this.getValordescuento());
	}

		
	}


