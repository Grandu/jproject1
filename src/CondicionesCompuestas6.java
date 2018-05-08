import java.util.Scanner;

public class CondicionesCompuestas6 {
	public static void main(String [] arg) {
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, num3;
		System.out.print("Indique el primer número: ");
		num1 = teclado.nextInt();
		System.out.print("Indique el segundo número: ");
		num2 = teclado.nextInt();
		System.out.print("Indique el tercer número: ");
		num3 = teclado.nextInt();
		
		if (num1 < 10 || num2 < 10 || num3 < 10) {
			System.out.println("Alguno de los números es menor a diez");
		} teclado.close();
	}

}
