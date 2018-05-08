import java.util.Scanner;

public class CondicionesCompuestas7 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		
		int x, y;
		System.out.print("indique la coordenada X: ");
		x = teclado.nextInt();
		System.out.print("Indique la coordenada Y: ");
		y = teclado.nextInt();
		
		if (x > 0 && y > 0) {
			System.out.println("Las coords se encuentran en el primer cuadrante");
		} else {
			if (x < 0 && y > 0 ) {
				System.out.println("Las coords se encuentran en el segundo cuadrante");
			} else {
				if (x < 0 && y < 0) {
					System.out.println("Las coords se encuentran en el tercer cuadrante");
				} else {
					System.out.println("Las coords se encuentran en el cuarto cuadrante");
				}
			}
		} teclado.close();
	} 
}
