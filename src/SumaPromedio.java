import java.util.Scanner;

public class SumaPromedio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3, num4, suma, promedio;
		System.out.print("Ingrese el valor del primer n�mero: ");
		num1 = teclado.nextInt();
		System.out.print("Ingrese el valor del segundo n�mero: ");
		num2 = teclado.nextInt();
		System.out.print("Ingrese el valor del tercer n�mero: ");
		num3 = teclado.nextInt();
		System.out.print("Ingrese el valor del cuarto n�mero: ");
		num4 = teclado.nextInt();
		suma = num1 + num2 + num3 + num4;
		promedio = suma / 4;
		System.out.print("La suma es: ");
		System.out.println(suma);
		System.out.print("El perimetro es: ");
		System.out.println(promedio);
		teclado.close();
	}
}
