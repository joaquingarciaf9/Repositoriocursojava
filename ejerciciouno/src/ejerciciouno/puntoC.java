package ejerciciouno;

import java.util.Scanner;

public class puntoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero de inicio:");
		int a = scanner.nextInt();
		System.out.println("Ingrese numero de fin:");
		int b = scanner.nextInt();
		int aux = a;
		int opcion;
		System.out.println("ingrese'1' para mostrar numeros pares o '2' para impares");
		opcion= scanner.nextInt();
		if(opcion==1){
			while(aux<=b){
				if(aux%2==0) {
				System.out.println(aux);
				}
				++aux;}
		}
		
		if(opcion==2){
		while(aux<=b){
			if(aux%2!=0) {
			System.out.println(aux);
			}
			++aux;}
		}
	}
}
	
