package ejercicio1;

public class Producto {
	
	//Atributos
	private Double precio;
	private String nombre;
	
	public Producto(Double precio, String nombre) {
		this.setPrecio(precio);
		this.setNombre(nombre);
		}
	

	
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
