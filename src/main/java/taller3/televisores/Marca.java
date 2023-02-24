package taller3.televisores;

public class Marca{
	String nombre;
	public Marca(String nom){
		nombre = nom;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nuevo){
		this.nombre = nuevo;
	}
}