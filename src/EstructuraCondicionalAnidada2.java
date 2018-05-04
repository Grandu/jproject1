import java.util.Scanner;

public class EstructuraCondicionalAnidada2 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("Indique el primer número: ");
		num1 = teclado.nextInt();
		System.out.print("Indique el segundo número: ");
		num2 = teclado.nextInt();
		System.out.print("Indique el tercer número: ");
		num3 = teclado.nextInt();
        if (num1>num2) {
            if (num1>num3) {
                System.out.print(num1);
            } else {
                System.out.println(num3);
            }
        } else {
            if (num2>num3) {
                System.out.print(num2);
            } else {
                System.out.print(num3);
            }
        } teclado.close();
    }
}