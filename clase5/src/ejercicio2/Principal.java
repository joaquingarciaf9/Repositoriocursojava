package ejercicio2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {

	public static void main(String[] args) {
		String rutaRelativa="Recursos/productos.txt";
		
		Path pathDelArchivo = Paths.get(rutaRelativa);
		

try {
	for(String linea : Files.readAllLines(pathDelArchivo)) {
	Producto producto = new Producto(Producto.setCantidad(linea.split("-")[0]),linea.split("-")[1],linea.split("-")[2]);
	Producto.setCantidad(linea[0]);
			}
	
						
		} catch (FileNotFoundException s) {
			System.out.println("El archivo no existe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}
