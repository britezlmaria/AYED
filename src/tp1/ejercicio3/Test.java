package tp1.ejercicio3;

public class Test {

	public static void main(String[] args) {
		Estudiante[] estudiantes=new Estudiante[2];
		
		estudiantes[0]=new Estudiante("toro","vacalin","5b","torovac@gmail","144 e/55");
		estudiantes[1]=new Estudiante("felipe","escudero","3a","felipeeesc","5555");
		
		
		Profesor[] profesores=new Profesor[3];
		
		profesores[0]=new Profesor("dobby","montero","dobbymontero","jeje","unlp");
		profesores[1]=new Profesor("pepe","pepe","pepe@","gg","unlp");
		profesores[2]=new Profesor("lele","pepe","lele@","g","uca");
				
		System.out.print("Estudiantes:");
		for(Estudiante estudiante:estudiantes) {
			System.out.print(estudiante.tusDatos());
		}
		for(Profesor profesor:profesores) {
			System.out.print(profesor.tusDatos());
		}
	}
	
}
