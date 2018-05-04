import java.util.Scanner;

public class EstructuraCondicionalCompuesta3 {
	public static void main(String [] arg) {
		Scanner teclado = new Scanner(System.in);
		int num1;
		System.out.print("Indique un número enter 1 y 99: ");
		num1 = teclado.nextInt();
		if (num1 > 9) {
			System.out.println("El número tiene 2 digitos");
						
		} else {
			System.out.println("El número tiene 1 digito");
		} teclado.close();
	}

}
