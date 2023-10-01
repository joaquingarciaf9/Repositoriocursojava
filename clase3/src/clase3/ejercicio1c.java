package clase3;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ejercicio1c {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer numeros[]= {10,20,40};
		int restriccion;
		System.out.println("Ingrese un numero para sumar los mayores al mismo: ");
		restriccion = scanner.nextInt();
		int suma=0;
		for(int elemento : numeros) {
			if(elemento >= restriccion) {
				suma=suma + elemento;
			}
		}
		
		System.out.println("la suma de los numeros es igual a: "+suma);

	}

}
