import java.util.Scanner;

public class CondicionesCompuestas1 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Indique el primer n�mero: ");
        num1 = teclado.nextInt();
        System.out.print("Indique el segundo n�mero: ");
        num2 = teclado.nextInt();
        System.out.print("Indique el tercer n�mero: ");
        num3 = teclado.nextInt();
        if (num1 > num2 && num1 > num3) {
        	System.out.print(num1);
        } else {
        	if (num2 > num3) {
        		System.out.print(num2);
        	} else {
        		System.out.print(num3);
        	}
        } teclado.close();
	} 

}
