package tp1.ejercicio5;

public class Calculo {
	
	public static String obtenerValores(int[] arreglo) {
		int max=-1;
		int min=9999;
		float suma=0;
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
		String aux="el maximo numero es: "+max+" el minimo es: "+min+" el promedio es: "+promedio;
		return aux;
	}
	
	public static void porParametro(int[] arreglo, int[] resultados) {
		int  suma=0;
		resultados[0] = Integer.MIN_VALUE;
		resultados[1] = Integer.MAX_VALUE;
		
		for (int i=0;i<arreglo.length;i++) {
			if(arreglo[i]>resultados[0]) {
				resultados[0]=arreglo[i];
			}
			if(arreglo[i]<resultados[1]) {
				resultados[1]=arreglo[i];
			}
			suma+=arreglo[i];
		}
	    resultados[2]=suma/arreglo.length;
	}
	
	public static void sinReturn(int[] arreglo) {
		int max=-1;
		int min=9999;
		float suma=0;
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
		System.out.print("el maximo numero es: "+max+" el minimo es: "+min+" el promedio es: "+promedio);
	}
	
	public static void main(String[] args) {
		int[] arreglo= {4,5,1,3};
		
		System.out.print("metodo a:");
		System.out.print(obtenerValores(arreglo));
		System.out.print("\n");
		
		System.out.print("metodo b:");
		int[] resultados=new int[3];
		porParametro(arreglo,resultados);
		System.out.print("el maximo es: "+resultados[0]+" el minimo es: "+resultados[1]+" el promedio es: "+resultados[2]+ "\n");
		
		System.out.print("metodo c:");
		sinReturn(arreglo);
		
	}
}
