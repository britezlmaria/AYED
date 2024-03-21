package tp1.ejercicio7;
import java.util.ArrayList;
import java.util.Scanner;

public class Capicua {
	public static void main (String [] args) {
		ArrayList <Integer> lista=new ArrayList<Integer>();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("ingrese un numero:");
		int numero=scanner.nextInt();
		
		while(numero != 0) {
			lista.add(numero);
			System.out.println("ingrese un numero:");
			numero=scanner.nextInt();
		}
		scanner.close();
		System.out.println("la lista es capicua: "+esCapicua(lista));
	}
	public static boolean esCapicua(ArrayList <Integer> lista) {
		
		int inicio=0;
		int fin=lista.size()-1;
		
		while(inicio<fin) {
			if(!lista.get(inicio).equals(lista.get(fin))) {
				return false;
			}
			inicio++;
			fin--;
			
		}
		return true;
	}
}
