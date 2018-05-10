import java.util.Scanner;

public class EstructuraRepetitivaWhile6 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		
		int x, n, promedio, altura, suma;
		x = 1;
		suma = 0;
		
		System.out.print("Cuantas alturas procesará");
		n = teclado.nextInt();
		while (x <= n) {
			System.out.print("Indique la altura: ");
			altura = teclado.nextInt();
			suma = suma + altura;
			x = x + 1;
		}
		promedio = suma / n;
		System.out.print("El promedio de las alturas es: ");
		System.out.print(promedio);
		teclado.close();
		
	}

}
