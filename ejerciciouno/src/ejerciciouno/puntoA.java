package ejerciciouno;

import java.util.Scanner;

public class puntoA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese numero de inicio:");
		int a = scanner.nextInt();
		System.out.println("Ingrese numero de fin:");
		int b = scanner.nextInt();
		int aux = a;
		
		while(aux<=b) {
			System.out.println(aux);
			++aux;
		}
		
		
		
		
	}

}
