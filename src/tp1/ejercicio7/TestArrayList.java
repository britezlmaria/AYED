
package tp1.ejercicio7;
import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> lista=new ArrayList<Integer>();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("ingrese numeros (ingrese 0 para terminar)");
		int numero=scanner.nextInt();

		while(numero!=0) {
			lista.add(numero);
			numero=scanner.nextInt();
		}
		scanner.close();
		for(Integer num:lista) {
			System.out.println("el numero es: "+num);
		}
	}
}