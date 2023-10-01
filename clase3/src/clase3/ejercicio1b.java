package clase3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ejercicio1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer numeros[]= {1,2,-2};
		int opcion;
		System.out.println("Ingrese 1 para ordenar de manera ascendete y 2 para ordenar de manera descendente:");
		opcion= scanner.nextInt();
		if(opcion==1) {
			Arrays.sort(numeros);
		}
		else {
			Arrays.sort(numeros, Collections.reverseOrder());
		}
		for(int elemento : numeros) {
			System.out.println(elemento);
		}
		
		
	}

}
