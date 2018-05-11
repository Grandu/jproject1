import java.util.Scanner;

public class EstructuraRepetitivaFor3 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		
		int f, aprobado, reprobado, nota;
		aprobado = 0;
		reprobado = 0;
				
		for (f = 1; f <= 10; f++) {
			System.out.print("Ingrese la nota");
			nota = teclado.nextInt();
			if (nota >= 7 ) {
				aprobado = aprobado + 1;				
			} else {
				reprobado = reprobado + 1;
			}			
		}
		System.out.print("Los aprobados son: ");
		System.out.println(aprobado);
		System.out.print("Los reprobados son: ");
		System.out.println(reprobado);
		teclado.close();
	}

}
