package ejerciciodos;



public class programa {

	public static void main(String[] args) {
		float ingresostotales=550000;
		int cantvehiculos=4; /*con antiguedad menor a 5 años*/
		int cantinmuebles=1;
		String bienesdelujo="SI"; /*Opcion SI|NO*/
		
		if((ingresostotales>=489083)&&(cantvehiculos>=3)&&(cantinmuebles>=3)&&(bienesdelujo=="SI")) {
			System.out.println("Esta persona pertenece al segmento de altos ingresos");
		}
		else {
			System.out.println("Esta perso a no pertenece al segmento de altos ingresos");
		}
	}

}
