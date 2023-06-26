package ejercicioCuentaAhorro;

public class PlazoFijo extends Cuenta {
	
	
	//Atributos
	int plazo;
	float interes;
	
	
	
	//Metodo constructor
	
	public PlazoFijo(String titular, float cantidad, int plazo, float interes) {
		super(titular, cantidad);
		this.plazo = plazo;
		this.interes = interes;
	}
	
	//Metodo para calcular el importe de interes
	
	public double obtenerInteres() {
		return (cantidad*interes)/100;
			
	}

	
	//Metodo para mostrar informacion
	
	public void mostrarInformacion() {
		System.out.println("Informacion de la cuenta de Plazo Fijo");
		imprimirDatos();
		System.out.println("Plazo: " + plazo);
		System.out.println("Interes: " + interes);
		System.out.println("Total Interes: " + obtenerInteres());
		
	}
}
