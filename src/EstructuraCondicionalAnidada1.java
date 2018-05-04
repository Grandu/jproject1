import java.util.Scanner;

public class EstructuraCondicionalAnidada1 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		int nota1, nota2, nota3, suma;
		float promedio;
		System.out.print("Indique la primera nota: ");
		nota1 = teclado.nextInt();
		System.out.print("Indique la segunda nota: ");
		nota2 = teclado.nextInt();
		System.out.print("Indique la tercera nota: ");
		nota3 = teclado.nextInt();
		suma = nota1 + nota2 + nota3;
		promedio = suma / 3;
		if (promedio >= 7) {
			System.out.println("Promocionado "+promedio);
		} else {
			if (promedio >= 4) {
				System.out.println("Regular "+promedio);
			} else {
				if (promedio < 4) {
					System.out.println("Suspendido "+promedio);
				}
			}
		} teclado.close();
				
	}

}

