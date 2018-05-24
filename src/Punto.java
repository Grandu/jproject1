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
    
    public void imprimir() {
        
    	if (x>0 && y>0) {
            System.out.print("Se encuentra en el primer cuadrante.");
        } else {
            if (x<0 && y>0) {
                System.out.print("Se encuentra en el segundo cuadrante.");
            } else {
                if (x<0 && y<0) {
                    System.out.print("Se encuentra en el tercer cuadrante.");
                } else {
                    if (x>0 && y<0) {
                        System.out.print("Se encuentra en el cuarto cuadrante.");
                    } else {
                        System.out.print("El punto no está en un cuadrante.");
                    }
                }
            }
        }
    }
    
    public static void main(String[] ar) {
        Punto punto1;
        punto1=new Punto();
        punto1.inicializar();
        punto1.imprimir();
    }
    

}
