import java.util.Scanner;

public class CondicionesCompuestas2 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		int dia, mes, anno;
		System.out.print("Indique el d�a: ");
		dia = teclado.nextInt();
		System.out.print("Indique el mes: ");
		mes = teclado.nextInt();
		System.out.print("Indique el a�o: ");
		anno = teclado.nextInt();
		if (mes == 1 || mes == 2 || mes == 3 ) {
			System.out.println("La fecha corresponde al primer trimestre.");
		} teclado.close();
				
	} 

}