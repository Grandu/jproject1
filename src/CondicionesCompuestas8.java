import java.util.Scanner;

public class CondicionesCompuestas8 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
	
		int sueldo, annos;
		System.out.print("indique el sueldo: ");
		sueldo = teclado.nextInt();
		System.out.print("Indique años de antigüedad: ");
		annos = teclado.nextInt();
		
		if (sueldo < 500 && annos >= 10) {
			System.out.print("Le corresponde un aumento del 20%: ");
			System.out.print(sueldo + (sueldo * 0.2));
		} else {
			if (sueldo < 500 && annos < 10) {
				System.out.print("Le corresponde un aumento del 5%%: ");
				System.out.print(sueldo + (sueldo * 0.05));
			} else {
				if (sueldo >= 500) {
					System.out.print("Sin cambios");
										
				}
			}
		} teclado.close();
	
	}
	
}
