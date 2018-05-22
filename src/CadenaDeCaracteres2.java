import java.util.Scanner;

public class CadenaDeCaracteres2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int edad1, edad2;
		String apenom1, apenom2;
		
		System.out.print("Indique el nombre y apellido: ");
		apenom1 = teclado.nextLine();
		System.out.print("Indique la edad:");
		edad1 = teclado.nextInt();
		System.out.print("Indique el nombre y apellido: ");
		teclado.nextLine();
		apenom2 = teclado.nextLine();
		System.out.print("Indique la edad:");
		edad2 = teclado.nextInt();
		
				
		System.out.print("La persona de mayor edad es:");
		if( edad1 > edad2 ) {
			System.out.print(apenom1);
		} else {
			System.out.print(apenom2);
		}		
	teclado.close();	
	}

}

