import java.util.Scanner;

public class CondicionesCompuestas4 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, num3, suma, producto;
		System.out.print("Indique el primer número: ");
		num1 = teclado.nextInt();
		System.out.print("Indique el segundo número: ");
		num2 = teclado.nextInt();
		System.out.print("Indique el tercer número: ");
		num3 = teclado.nextInt();
		suma = num1 + num2;
		producto = suma * num3;
		
		if (num1 == num2 && num1 == num3) {
			System.out.println(producto);
		} teclado.close(); 
	} 

}
