import java.util.Scanner;

public class SumaProducto4Numeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3, num4, suma, producto;
		System.out.print("Ingrese el valor del primer número: ");
		num1 = teclado.nextInt();
		System.out.print("Ingrese el valor del segundo número: ");
		num2 = teclado.nextInt();
		System.out.print("Ingrese el valor del tercer número: ");
		num3 = teclado.nextInt();
		System.out.print("Ingrese el valor del cuarto número: ");
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