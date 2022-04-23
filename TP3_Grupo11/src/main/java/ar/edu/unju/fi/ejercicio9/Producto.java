package ar.edu.unju.fi.ejercicio9;

public class Producto {
	String codigo;
	String descripcion;
	double precio;
	String marca;	
	
	public Producto(String codigo, String descripcion, double precio, String marca) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.marca = marca;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Producto [codigo: " + codigo + ", descripcion: " + descripcion + ", precio: " + precio + ", marca: " + marca
				+ "]";
	}
	
}
