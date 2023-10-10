package ejercicio1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Carrito {
		
	private LocalDate fecha;
	private List<ItemCarrito> items;
	
	public Carrito(){
		
		this.items = new ArrayList<ItemCarrito>();	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public List<ItemCarrito> getItems() {
		return items;
	}
	public void agregarItem(ItemCarrito ic) {
		this.items.add(ic);
	}
	
	public void quitarItem(ItemCarrito ic) {
		this.items.remove(ic);
	}
	
	public Double PrecioFinal() {
		Double preciofinal=0.0;
		for(ItemCarrito item: this.getItems() ) {
			preciofinal = preciofinal + item.precio();
		}
		return preciofinal;
	}		
	public Double PrecioFinal(Descuento desc) {
		Double preciofinal=0.0;
		for(ItemCarrito item: this.getItems() ) {
			preciofinal = preciofinal + item.precio();
		}
		return desc.valorFinal(preciofinal);
	}			
		}


