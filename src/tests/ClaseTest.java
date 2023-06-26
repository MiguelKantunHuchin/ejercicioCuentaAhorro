package tests;

import ejercicioCuentaAhorro.CajaAhorro;
import ejercicioCuentaAhorro.PlazoFijo;


public class ClaseTest {

	public static void main(String[] args) {
		
		
		//Instancia No 1. Caja de ahorro
		CajaAhorro instancia1 = new CajaAhorro("Miguel", 1000.0f);
		
		
		//Instancia No 2. Plazo fijo
		
		PlazoFijo instancia2 = new PlazoFijo("Angel", 2500.0f, 12, 10.0f);
		
		
		instancia1.imprimirDatos(); //titular y cantidad
		System.out.println(); //espacio vacio
		instancia2.mostrarInformacion(); //Titular, Cantidad, plazo, intereses
		

	}

}
