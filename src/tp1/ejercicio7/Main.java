package tp1.ejercicio7;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		TestArrayList test=new TestArrayList();
		test.crearLista();
		
		System.out.println("");
		ListaEstudiante list=new ListaEstudiante();
		list.ListaEst();
		
		ArrayList<Integer>lista=new ArrayList<>();
		Capicua capicua=new Capicua();
		capicua.generarLista(lista);;
		System.out.println("la lista es capicua:"+capicua.esCapicua(lista));
	}

}
