
package tp1.ejercicio7;
import java.util.ArrayList;
import java.util.Scanner;


public class TestArrayList {
	
	public void crearLista() {
	Scanner scanner=new Scanner(System.in);
	
	ArrayList <Integer> lista=new ArrayList<>();
	
	System.out.println("ingrese un numero:");
	int n=scanner.nextInt();
	
	while(n != 0) {
		lista.add(n);
		System.out.println("ingrese un numero:");
		n=scanner.nextInt();
	}
	scanner.close();
	
	for (int i=0;i<lista.size();i++) {
		System.out.println("el numero es: " +lista.get(i)+"\n");
	}
	}
	
	
}
