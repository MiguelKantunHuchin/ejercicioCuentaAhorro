package ejercicioCuentaAhorro;

public class Cuenta {
	
	//Atributos
	
	 String titular;
	 float cantidad;
	
	
	//Constructor para heredarlo a las subclases
	
	public Cuenta(String titular, float cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	
	//Metodo para imprimir datos
	
	public void imprimirDatos() {
		
		System.out.println("Titular: " + titular);
		System.out.println("Cantidad: " + cantidad);
	}


	

}
