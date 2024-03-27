package tp1.ejercicio7;

public class Estudiante {
	private String nombre;
	private String apellido;
	private int edad;
	private int curso;
	
	public Estudiante(String nombre, String apellido, int edad,int curso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.curso=curso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public String toString() {
		return "estudiante: "+"nombre: "+nombre+" apellido: "+apellido+" edad: "+edad+" curso: "+curso+"\n";
	}
	
}
