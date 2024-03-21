package tp1.ejercicio7;
import java.util.ArrayList;

public class CrearLista {
	public static void main(String[]args) {
		
		ArrayList <Estudiante> lista=new ArrayList<Estudiante>();
		
		
		Estudiante est1=new Estudiante("marilu","britez",20,1);
		Estudiante est2=new Estudiante("feli","escudero",20,2);
		Estudiante est3=new Estudiante("juli","lunazzi",19,3);
		Estudiante est4=new Estudiante("lala","lalu",19,4);
		
		lista.add(est1);
		lista.add(est2);
		lista.add(est3);
		lista.add(est4);
		
		ArrayList<Estudiante> copia=new ArrayList<Estudiante>();
		
		for(Estudiante e:lista) {
			copia.add(e);
		}
		lista.get(0).setEdad(19);
		System.out.println("lista original:");
		for(Estudiante estudiante:lista) {
			System.out.println("estudiante: "+estudiante);

		}
		System.out.println("----------------------");
		System.out.println("copia de la lista:");
		
		for(Estudiante est:copia) {
			System.out.println(est);
		}
		
	}	
}
