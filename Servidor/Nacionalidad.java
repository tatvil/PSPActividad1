package Servidor;

import java.util.Objects;

public class Nacionalidad {
	private int id;
	private String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nacionalidad other = (Nacionalidad) obj;
		return id == other.id && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Nacionalidad [id=" + id + ", nombre=" + nombre + "]";
	}
	
	public static void main(String[] args) {
		Nacionalidad[] Nacionalidades = new Nacionalidad[10];
	
		Nacionalidades[0].setId(1);
		Nacionalidades[0].setNombre("Estados Unidos");
	
		Nacionalidades[1].setId(2);
		Nacionalidades[1].setNombre("España");
	}
}
