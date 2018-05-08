import java.util.Scanner;

public class CondicionesCompuestas3 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		int dia, mes, anno;
		System.out.print("Indique el día: ");
		dia = teclado.nextInt();
		System.out.print("Indique el mes: ");
		mes = teclado.nextInt();
		System.out.print("Indique el año: ");
		anno = teclado.nextInt();
		if (dia == 25 && mes == 12 ) {
			System.out.println("Es navidad!");
		} teclado.close();
	}

}
