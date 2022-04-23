package ar.edu.unju.fi.ejercicio3;

public class Alumno {
	private String nombre;
	private String apellido;
	private int lu;
	private int[] notas;
	
	public Alumno() {
		
	}
	public Alumno(String nombre, String apellido, int lu, int[] notas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.lu = lu;
		this.notas = notas;
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
	public int getLu() {
		return lu;
	}
	public void setLu(int lu) {
		this.lu = lu;
	}
	public int[] getNotas() {
		return notas;
	}
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	
	public double calcularPromedio() {
		double contador=0;
		for(int i=0;i<notas.length;i++) {
			contador=contador+notas[i];
		}
		return contador/notas.length;
	}
	
	public double obtenerNotaMaxima() {
		double maximo=0;
		for(int i=0;i<notas.length;i++) {
			if(notas[i]>=maximo) {
				maximo=notas[i];
			}
		}
		return maximo;
	}
}