import java.util.Scanner;

public class PruebaVector3 {
	private Scanner teclado;
	private float[] tman;
	private float[] ttar;
	
	
	public void cargar() {
		teclado = new Scanner(System.in);
		tman = new float[4];
		ttar = new float[4];
		System.out.println("Sueldos de empleados del turno de la mañana.");
		for(int f = 0;f < 4; f++) {
			System.out.print("indique el sueldo:");
			tman[f] = teclado.nextFloat();
		}
		System.out.println("Sueldos de empleados del turno de la tarde.");
		for(int f = 0;f < 4; f++) {
			System.out.print("indique el sueldo:");
			ttar[f] = teclado.nextFloat();
		}
	}
	
	public void calcularGastos() {
		float sumatman;
		float sumattar;
		sumatman = 0;
		sumattar = 0;
		for (int f = 0; f < 4; f++) {
			sumatman=sumatman+tman[f];
			sumattar=sumattar+ttar[f];
		}
		System.out.println("Total de sueldos de la mañana:"+sumatman);
	    System.out.println("Total de sueldos de la mañana:"+sumattar);
	}
	
	public static void main(String[] ar) {
		PruebaVector3 pv = new PruebaVector3();
		pv.cargar();
		pv.calcularGastos();
	}

}
