package tp1.ejercicio7;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;

public class Sucesion {
	public static void main(String []args) {
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("ingrese un numero:");
		int n=scanner.nextInt();
		scanner.close();
		ArrayList<Integer>lista=obtenerLista(n);
		for (Integer list:lista) {
			System.out.println("el numero de la lista es:"+list);
		}
		inversion(lista);
		System.out.println("lista invertida:");
		for (Integer list:lista) {
			System.out.println("el numero de la lista es:"+list);
		}
		ArrayList <Integer> lista1=new ArrayList<Integer>(java.util.List.of(1,3,5,7));
		ArrayList<Integer>lista2=new ArrayList<Integer>(java.util.List.of(2,4,6,8));
		ArrayList<Integer>resultado=combinarOrdenado(lista1,lista2);
		
		System.out.println("la lista ordenada es:");
		for (Integer res:resultado) {
			System.out.println("el numero de la lista es:"+res);
		}
	}
	public static void obtenerSucesion(int n,ArrayList<Integer>lista){
		if (n!=1){		
			if (n % 2==0){
				n=n/2;
			}
			else {
				n=3*n+1;
			}
			lista.add(n);
			obtenerSucesion(n,lista);
	}
	}
	public static ArrayList<Integer> obtenerLista(int n){
		ArrayList <Integer> lista=new ArrayList<Integer>();
		obtenerSucesion(n,lista);
		return lista;
	}
	public static void invertir(ArrayList<Integer>lista,int inicio, int fin) {
		if(inicio<fin) {
			int pos=lista.get(inicio);
			lista.set(inicio,lista.get(fin));
			lista.set(fin, pos);
			invertir(lista,inicio+1,fin-1);
		}
		
	}
	public static void inversion(ArrayList <Integer> lista) {
		if(lista !=null && lista.size()>=1){
			invertir(lista,0,lista.size()-1);
		}
	}
	private static int sumar(LinkedList<Integer>lista) {
		if(lista.size()==1) {
			return lista.get(0);
		}else {
			return lista.removeFirst()+sumar(lista);
		}
	}
	public static int devolverSuma(LinkedList<Integer>lista) {
		if(lista==null || lista.isEmpty()) {
			return 0;
		}else
			return sumar(lista);
	}
	public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer>lista1,ArrayList<Integer>lista2){
		ArrayList <Integer> resultado=new ArrayList<Integer>();
		int indice1=0;
		int indice2=0;
		while(indice1<lista1.size() && indice2<lista2.size()){
			if(lista1.get(indice1)<lista2.get(indice2)) {
				resultado.add(lista1.get(indice1));
				indice1++;
			}else {
				resultado.add(lista2.get(indice2));
				indice2++;
			}
		}
		while(indice1<lista1.size()) {
			resultado.add(lista1.get(indice1));
			indice1++;
		}
		while(indice2<lista2.size()) {
			resultado.add(lista2.get(indice2));
			indice2++;
		}
		return resultado;
	}
}
