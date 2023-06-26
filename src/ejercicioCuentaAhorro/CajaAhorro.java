package ejercicioCuentaAhorro;

public class CajaAhorro extends Cuenta {

	// Este metodo hereda los datos en el constructor
	public CajaAhorro(String titular, float cantidad) {
		super(titular, cantidad);
		// TODO Auto-generated constructor stub
	}

	// Imprimiendo datos de la fotma tradicional
	public void imprimirDatos() {

		System.out.println("Titular: " + titular);
		System.out.println("Cantidad: " + cantidad);
	}

//Imprimiendo datos con el metodo  toString

	@Override
	public String toString() {
		return "CajaAhorro [titular=" + titular + ", cantidad=" + cantidad + "]";
	}

}
