import java.util.Scanner;

public class CadenaDeCaracteres3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String ape1, ape2;
		
		System.out.print("Introduzca un apellido: ");
		ape1 = teclado.nextLine();
		System.out.print("Introduzca un apellido: ");
		ape2 = teclado.nextLine();
		
		if ( ape1.equals(ape2)) {
			System.out.print("Los apellidos son iguales");
		} else {
			System.out.print("Los apellidos son distintos");
		}
		teclado.close();
			
	}

}
