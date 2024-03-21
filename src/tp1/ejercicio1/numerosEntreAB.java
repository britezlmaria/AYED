package tp1.ejercicio1;

public class numerosEntreAB {
	public static void conFor(int a,int b) {
		for (int i=a;i<=b;i++) {
			System.out.println(i);
		}
	}
	
	public static void conWhile(int a,int b){
		int i=a;
		while(i<=b) {
			System.out.print(i);
			i++;
		}
	}
	public static void sinIteraciones(int a,int b) {
		if(a<=b) {
			System.out.print(a);
			sinIteraciones(a+1,b);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("usando for:");
		conFor(1,5);
		
		System.out.print("usando while:");
		conWhile(1,5);
		
		System.out.print("sin iteraciones:");
		sinIteraciones(1,5);
	}
}
