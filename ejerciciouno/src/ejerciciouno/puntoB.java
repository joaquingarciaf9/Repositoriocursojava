package ejerciciouno;

import java.util.Scanner;

public class puntoB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero de inicio:");
		int a = scanner.nextInt();
		System.out.println("Ingrese numero de fin:");
		int b = scanner.nextInt();
		int aux = a;
		
		
		while(aux<=b){
			if(aux%2==0) {
			System.out.println(aux);
			}
			++aux;
		}
	}

}
