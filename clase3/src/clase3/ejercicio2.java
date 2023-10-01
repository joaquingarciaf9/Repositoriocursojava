package clase3;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase="hola que tal";
		byte[]decodedbytes=frase.getBytes();
		for(int i=0;i<decodedbytes.length;i++) {
			decodedbytes[i]++;
		}
		String aux= new String(decodedbytes);
		System.out.println(frase);
		System.out.println(aux);
	}

}
