import java.util.Scanner;

public class EstructuraCondicionalCompuesta1 {
	public static void main(String[] ar) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		System.out.print("Indique el primer n�mero: ");
		num1 = teclado.nextInt();
		System.out.print("Indique el segundo n�mero: ");
		num2 = teclado.nextInt();
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		} teclado.close();
	}
}