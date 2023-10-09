package ejercicio1;

public class Producto {
	
	//Atributos
	private Integer precio;
	private String nombre;
	
	public Producto(Integer precio, String nombre) {
		this.setPrecio(precio);
		this.setNombre(nombre);
		}
	
	Producto caramelos =  new Producto(500,"caramelos");
	Producto costilla =  new Producto(1500,"costilla");
	Producto leche =  new Producto(300,"leche");
	Producto cocacola =  new Producto(400,"cocacola");
	Producto fideos =  new Producto(650,"fideos");
	
	
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
