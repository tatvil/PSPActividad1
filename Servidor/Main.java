package Servidor;
import Nacionalidades;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Director[] Directores = new Director[10];
		Pelicula[] Peliculas = new Pelicula[10];
		

		
		Directores[0].setId(1);
		Directores[0].setNombre("James");
		Directores[0].setApellidos("Cameron");
		Directores[0].setNacionalidad("Estados Unidos");
		
		Directores[1].setId(2);
		Directores[1].setNombre("Steven");
		Directores[1].setApellidos("Spelberg");
		Directores[1].setNacionalidad("Estados Unidos");
		
		Peliculas[0].setId(1);
		Peliculas[0].setDirector(Directores[0]);
		Peliculas[0].setTitulo("Avatar");
		Peliculas[0].setPrecio(10);
		
		Peliculas[1].setId(2);
		Peliculas[1].setDirector(Directores[0]);
		Peliculas[1].setTitulo("Avatar. El sentido del agua");
		Peliculas[1].setPrecio(15);
		
		Peliculas[2].setId(3);
		Peliculas[2].setDirector(Directores[1]);
		Peliculas[2].setTitulo("La lista de Schindler");
		Peliculas[2].setPrecio(10);
	
		Peliculas[3].setId(4);
		Peliculas[3].setDirector(Directores[1]);
		Peliculas[3].setTitulo("ET El Extraterrestre");
		Peliculas[3].setPrecio(10);
		
		System.out.println(Peliculas[0]);
	}

}
