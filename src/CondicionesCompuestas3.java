import java.util.Scanner;

public class CondicionesCompuestas3 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		int dia, mes, anno;
		System.out.print("Indique el d�a: ");
		dia = teclado.nextInt();
		System.out.print("Indique el mes: ");
		mes = teclado.nextInt();
		System.out.print("Indique el a�o: ");
		anno = teclado.nextInt();
		if (dia == 25 && mes == 12 ) {
			System.out.println("Es navidad!");
		} teclado.close();
	}

}
