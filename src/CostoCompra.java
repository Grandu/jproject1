import java.util.Scanner;

public class CostoCompra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int precio;
		float catidad, costo;
		System.out.print("Indique el precio del artículo: ");
		precio = teclado.nextInt();
		System.out.print("Indique cuantos artículos lleva: ");
		catidad = teclado.nextInt();
		costo = precio * catidad;
		System.out.print("Debe abonar: ");
		System.out.println(costo);
		teclado.close();
	}
}