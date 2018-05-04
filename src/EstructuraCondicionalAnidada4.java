import java.util.Scanner;

public class EstructuraCondicionalAnidada4 {
    public static void main(String[] ar) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.print("Ingrese un valor entre 1 y 999:");
        num1 = teclado.nextInt();
        if (num1 < 10) {
	    System.out.print("El número es de 1 cifra.");
        } else {
        	if (num1 < 100) {
	        System.out.print("El número es de 2 cifras.");
	    } else {
	    	if (num1 < 1000) {
	    		System.out.print("El número es de 3 cifras.");
	    	} else {
	    		System.out.print("El número es erroneo.");
	    		}
	    	}
	     } teclado.close();
      }
    } 