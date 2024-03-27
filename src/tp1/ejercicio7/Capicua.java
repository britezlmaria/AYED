package tp1.ejercicio7;
import java.util.ArrayList;
import java.util.Scanner;

public class Capicua {
	ArrayList <Integer> lista=new ArrayList<>();
	
	public void generarLista(ArrayList <Integer> lista) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ingrese un número:");
	    while (scanner.hasNextInt()) { 
	        int n = scanner.nextInt();
	        if (n != 0) {
	            lista.add(n);
	        } else {
	            break; 
	        }
	        System.out.println("Ingrese otro número (ingrese 0 para terminar):");
	    }
	    scanner.close();
	}
	
	public boolean esCapicua(ArrayList <Integer> lista) {
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
