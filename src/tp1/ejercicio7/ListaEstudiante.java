package tp1.ejercicio7;
import java.util.ArrayList;

public class ListaEstudiante {
	public void ListaEst() {
		ArrayList<Estudiante> lista=new ArrayList<>();
		lista.add(new Estudiante("marilu","britez",20,2));
		lista.add(new Estudiante("felipe","escudero",20,3));
		lista.add(new Estudiante("dobby","l",15,1));
		
		ArrayList<Estudiante> copia=new ArrayList<>(lista);
		
		System.out.println("lista original:"+"\n");
		for(Estudiante e:lista) {
			System.out.println("estudiante: "+e+"\n");
		}
		System.out.println("copia de la lista:"+"\n");
		for (Estudiante est:copia) {
			System.out.println("estudiante: "+est+"\n");
		}
		Estudiante estudiante=new Estudiante("valentina","bla",21,4);
		if(!lista.contains(estudiante)) {
			lista.add(estudiante);
		}
		for(Estudiante e:lista) {
			System.out.println("estudiante: "+e+"\n");
		}
		System.out.println("copia de la lista:"+"\n");
		for (Estudiante est:copia) {
			System.out.println("estudiante: "+est+"\n");
		}
	}
}
