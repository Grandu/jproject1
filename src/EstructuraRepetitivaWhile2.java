import java.util.Scanner;

public class EstructuraRepetitivaWhile2 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		
		int x, n;
		System.out.print("Indique el primer número: ");
		n = teclado.nextInt();
		x = 1;
		
		while (x <= n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
		}		
		
		teclado.close();
	}

}
