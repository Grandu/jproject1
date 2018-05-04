import java.util.Scanner;

public class EstructuraCondicionalCompuesta2 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, suma, resta, producto;
		float division;
		System.out.print("Indique el primer número: ");
		num1 = teclado.nextInt();
		System.out.print("Indique el segundo número: ");
		num2 = teclado.nextInt();
		suma = num1 + num2;
		resta = num1 - num2;
		producto = num1 * num2;
		division = num1 / num2;
		if (num1 > num2) {
			System.out.println("La suma es: ");
			System.out.println(suma);
			System.out.println("La resta es: ");
			System.out.println(resta);
			
		} else {
			System.out.println("El producto es: ");
			System.out.println(producto);
			System.out.println("La division es: ");
			System.out.println(division);
			teclado.close();
		} 
		
	}

}
