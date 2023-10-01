package clase3;

import java.util.Scanner;

public class ejercicio1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char unaletra='a';
		int cantapariciones=0;
		String frase;
		System.out.println("Ingrese una frase: ");
		frase= scanner.nextLine();
		for(int i=0 ; i < frase.length(); i++ ){
			if(frase.charAt(i)==unaletra) {
				cantapariciones++;}
			}
		System.out.println("La cantidad de veces que apracere la letra '"+unaletra+"' es: "+cantapariciones);
		
		
		
	}

}
