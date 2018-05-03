import java.util.Scanner;

public class SumaProductoNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, suma, producto;
		System.out.print("Ingrese el primer valor: ");
		num1 = teclado.nextInt();
		System.out.print("Ingrese el segundo valor: ");
		num2 = teclado.nextInt();
		suma = num1 + num2;
		producto = num1 * num2;
		System.out.print("La suma de los números es: ");
		System.out.println(suma);
		System.out.print("El producto de los números es: ");
		System.out.println(producto);
		teclado.close();
	}
}
