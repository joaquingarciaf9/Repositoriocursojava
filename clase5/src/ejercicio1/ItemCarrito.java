package ejercicio1;

public class ItemCarrito {
	
	private Integer cantidad;
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private Integer preciototal;
	
	public ItemCarrito(Producto producto1, Producto producto2, Producto producto3) {
		this.setProducto1(producto1);
		this.setProducto2(producto2);
		this.setProducto3(producto3);
		}
	
	public Integer precio(Producto producto,Integer cantidad) {
			Integer precio;
			precio= (getProducto1().getPrecio())*cantidad;
		return precio ;
	}
	
	
	
	
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Producto getProducto1() {
		return producto1;
	}
	public void setProducto1(Producto producto1) {
		this.producto1 = producto1;
	}
	public Producto getProducto2() {
		return producto2;
	}
	public void setProducto2(Producto producto2) {
		this.producto2 = producto2;
	}
	public Producto getProducto3() {
		return producto3;
	}
	public void setProducto3(Producto producto3) {
		this.producto3 = producto3;
	}



}
