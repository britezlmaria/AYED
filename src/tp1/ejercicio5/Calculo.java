package tp1.ejercicio5;
import java.util.Scanner;

public class Calculo {
	
	private static int maximo=Integer.MIN_VALUE;
	private static int minimo=Integer.MAX_VALUE;
	private static float prom=0;
	
	
	public Calculo(int max, int min, float promedio) {
		super();
		maximo = max;
		minimo = min;
		prom = promedio;
	}
	public static int getMaximo() {
		return maximo;
	}
	public static void setMaximo(int max) {
		maximo = max;
	}
	public static int getMinimo() {
		return minimo;
	}
	public static void setMinimo(int min) {
		minimo = min;
	}
	public static float getProm() {
		return prom;
	}
	public static void setProm(float promedio) {
		prom = promedio;
	}
	public static String conReturn(int [] arreglo) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int suma=0;
		for (int i=0;i<arreglo.length;i++) {
			if(arreglo[i]>max) {
				max=arreglo[i];
			}
			if(arreglo[i]<min) {
				min=arreglo[i];
			}
			suma+=arreglo[i];
		}
		float promedio=suma/arreglo.length;
		return "el maximo es: "+max+"\n"+ "el minimo es: "+min+"\n" +"el promedio es: "+promedio;
	}
	public static void conParametro(int[]arreglo,int[]resultado) {
		resultado[0]=Integer.MIN_VALUE;
		resultado[1]=Integer.MAX_VALUE;
		int suma=0;
		
		for (int i=0;i<arreglo.length;i++) {
			if(arreglo[i]>resultado[0]) {
				resultado[0]=arreglo[i];
			}
			if(arreglo[i]<resultado[1]) {
				resultado[1]=arreglo[i];
			}
			suma+=arreglo[i];
		}
		resultado[2]=suma/arreglo.length;
	}
	
	public static void sinReturn(int[] arreglo) {
		int suma=0;
		for (int i=0;i<arreglo.length;i++) {
			if(arreglo[i]>getMaximo()) {
				setMaximo(arreglo[i]);
			}
			if(arreglo[i]<getMinimo()) {
				setMinimo(arreglo[i]);
			}
			suma+=arreglo[i];
		}
		setProm(suma/arreglo.length);
		System.out.println("el maximo es: "+getMaximo()+" el minimo es: "+getMinimo()+" el promedio es: "+getProm());
	}
	public static void main(String[] args) {
		int [] arreglo=new int[4];
		Scanner scanner=new Scanner(System.in);
		
		for (int i=0;i<arreglo.length;i++) {
			System.out.println("ingrese un numero para el arreglo:");
			int n=scanner.nextInt();
			arreglo[i]=n;
		}
		scanner.close();
		System.out.println("con metodo return:");
		System.out.print(conReturn(arreglo));
		
		System.out.println("");
		
		System.out.println("con parametros:");
		int[]resultado=new int[3];
		conParametro(arreglo,resultado);
		System.out.println("el maximo es: "+resultado[0]+" el minimo es: "+resultado[1]+" el promedio es: "+resultado[2]);
		
		System.out.println("");
		
		System.out.println("con variables de instancia:");
		sinReturn(arreglo);
		
	}	
		
}
