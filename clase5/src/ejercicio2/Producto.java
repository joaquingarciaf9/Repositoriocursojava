package ejercicio2;

public class Producto {
public  String nombre;
public String cantidad;
public String precio;

public Producto(String nombre, String cantidad, String precio) {
	this.setCantidad(cantidad);
	this.setPrecio(precio);
	this.setNombre(nombre);
}



public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCantidad() {
	return cantidad;
}
public void setCantidad(String cantidad) {
	this.cantidad = cantidad;
}
public String getPrecio() {
	return precio;
}
public void setPrecio(String precio) {
	this.precio = precio;
}

}
