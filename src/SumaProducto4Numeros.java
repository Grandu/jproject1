import java.util.Scanner;

public class SumaProducto4Numeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3, num4, suma, producto;
		System.out.print("Ingrese el valor del primer n�mero: ");
		num1 = teclado.nextInt();
		System.out.print("Ingrese el valor del segundo n�mero: ");
		num2 = teclado.nextInt();
		System.out.print("Ingrese el valor del tercer n�mero: ");
		num3 = teclado.nextInt();
		System.out.print("Ingrese el valor del cuarto n�mero: ");
		num4 = teclado.nextInt();
		suma = num1 + num2;
		producto = num3 * num4;
		System.out.print("La suma es: ");
		System.out.println(suma);
		System.out.print("El producto es: ");
		System.out.println(producto);
		teclado.close();
	}
}