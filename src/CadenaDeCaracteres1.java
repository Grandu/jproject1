import java.util.Scanner;

public class CadenaDeCaracteres1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int edad1, edad2;
		String nombre1, nombre2;
		
		System.out.print("Indique el nombre:");
		nombre1 = teclado.next();
		System.out.print("Indique la edad:");
		edad1 = teclado.nextInt();
		System.out.print("Indique el nombre:");
		nombre2 = teclado.next();
		System.out.print("Indique la edad:");
		edad2 = teclado.nextInt();
		
		System.out.print("La persona de mayor edad es:");
		if( edad1 > edad2 ) {
			System.out.print(nombre1);
		} else {
			System.out.print(nombre2);
		}
		teclado.close();
				
	}
}
