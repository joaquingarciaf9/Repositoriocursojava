package com.compraProductos;

import com.compraProductos.moels.Carrito;
import com.compraProductos.moels.DescuentoFijo;
import com.compraProductos.moels.DescuentoPorcentaje;
import com.compraProductos.moels.ItemCarrito;
import com.compraProductos.moels.Producto;

public class App 
{
	public static void main(String[] args) {
		
		DescuentoFijo desc1= new DescuentoFijo();
		desc1.setValordescuento(980.0);
		DescuentoPorcentaje desc2 = new DescuentoPorcentaje();
		desc2.setValordescuento(0.3);
		
		Producto leche= new Producto(600.0,"Leche");
		Producto asado= new Producto(1800.0, "Asado");
		Producto queso= new Producto(750.0,"Queso");
		
		ItemCarrito item1 = new ItemCarrito(leche,2.0);
		ItemCarrito item2 = new ItemCarrito(asado,1.0);
		ItemCarrito item3 = new ItemCarrito(queso,3.0);
		
		Carrito unCarrito= new Carrito();
		
		unCarrito.agregarItem(item3);
		unCarrito.agregarItem(item1);
		unCarrito.agregarItem(item2);
		
		System.out.println("El desceunto fijo es de:$"+desc1.getValordescuento());
		System.out.println("El descuento de porcentaje es de:%"+desc2.getValordescuento()*100.0);
		System.out.println("El precio final sin ningun descuento es de:$"+unCarrito.PrecioFinal());
		System.out.println("El precio final con el desceunto de porcentaje es de:$"+unCarrito.PrecioFinal(desc2));
		System.out.println("El precio final con el desceunto fijo es de:$"+unCarrito.PrecioFinal(desc1));
    }
}
