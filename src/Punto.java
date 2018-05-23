import java.util.Scanner;

public class Punto {
	private Scanner teclado;
    private int x, y;
	
    public void inicializar() {
        teclado = new Scanner(System.in);
        System.out.print("Ingrese X: ");
        x = teclado.nextInt();
        System.out.print("Ingrese Y: ");
        y = teclado.nextInt();        
    }
    
    
    
    

}
