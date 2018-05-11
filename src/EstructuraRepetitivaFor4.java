import java.util.Scanner;

public class EstructuraRepetitivaFor4 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		
		int n, num, mul3, mul5;
		mul3 = 0;
		mul5 = 0;
		
		for (n = 1; n <= 10; n++) {
			System.out.print("Ingrese un número");
			num = teclado.nextInt();
			if ((num % 3) == 0) {
				mul3 = mul3 + 1;
			} else {
				if ((num % 5) ==0) {
					mul5 = mul5 + 1;
				}
			}
		}
		System.out.print("Los multiplos de 3 son: ");
		System.out.println(mul3);
		System.out.print("Los multiplos de 5 son: ");
		System.out.println(mul5);
		
		teclado.close();
	}

}
