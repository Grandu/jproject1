import java.util.Scanner;

public class EstructuraCondicionalAnidada5 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
        int preguntas, respuestas, resultado;
        System.out.print("Cuantas preguntas tiene el test?");
        preguntas = teclado.nextInt();
        System.out.print("Cuantas preguntas ha respondido?");
        respuestas = teclado.nextInt();
        resultado = respuestas * 100 / preguntas;
        if (resultado >= 90) {
        	System.out.print("Ha obtenido el nivel máximo"+resultado);
        } else {
        	if (resultado >= 75) {
        		System.out.print("Nivel medio"+resultado);
        	} else {
        		if (resultado >= 50) {
        			System.out.print("Nivel regular"+resultado);
        		} else {
        			System.out.print("Fuera de nivel"+resultado);
        		}
        	}
        } teclado.close();
	}

}
