import java.util.Scanner;

public class EstructuraCondicionalSimple1 {
	public static void main(String[] ar) {
		Scanner teclado = new Scanner(System.in);
		float sueldo;
		System.out.print("Indique el sueldo: ");
		sueldo = teclado.nextFloat();
		if (sueldo > 3000) {
			System.out.println("Debe abonar impuestos");
		} teclado.close();
	}

}