package Servidor;

import java.util.ArrayList;

public class Main {
    private static String[] nacionalidades;
    private static ArrayList<Director> directores;
    private static ArrayList<Pelicula> peliculas;

    public static void cargarDatos() {
        nacionalidades = new String[]{"Estados Unidos", "Reino Unido", "España", "Italia"};

        // Crear un ArrayList de directores
        directores = new ArrayList<>();

        // Agregar directores al ArrayList
        directores.add(new Director(1, "James", "Cameron", nacionalidades[0]));
        directores.add(new Director(2, "Steven", "Spielberg", nacionalidades[0]));
        directores.add(new Director(3, "Pedro", "Almodovar", nacionalidades[2]));
        directores.add(new Director(4, "Roberto", "Benigni", nacionalidades[3]));
        directores.add(new Director(5, "Chris", "Columbus", nacionalidades[0]));
        directores.add(new Director(6, "George", "Lucas", nacionalidades[0]));

        // Crear un ArrayList de peliculas
        peliculas = new ArrayList<>();

        // Agregar peliculas al ArrayList
        peliculas.add(new Pelicula(1, directores.get(0), "Avatar", 10));
        peliculas.add(new Pelicula(2, directores.get(0), "Avatar. El sentido del agua", 15));
        peliculas.add(new Pelicula(3, directores.get(1), "Jurassic Park", 12));
        peliculas.add(new Pelicula(4, directores.get(1), "E.T. el Extra Terrestre", 14));
        peliculas.add(new Pelicula(5, directores.get(1), "La lista de Schindler", 14));
        peliculas.add(new Pelicula(6, directores.get(2), "Mujeres al borde de un ataque de nervios", 10));
        peliculas.add(new Pelicula(7, directores.get(2), "Todo sobre mi madre", 10));
        peliculas.add(new Pelicula(8, directores.get(3), "La vida es bella", 10));
        peliculas.add(new Pelicula(9, directores.get(5), "Indiana Jones", 9));
        peliculas.add(new Pelicula(10, directores.get(4), "Harry Potter y la piedra filosofal", 10));
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        cargarDatos();

        System.out.println("NACIONALIDADES");
        for (String nacionalidad : nacionalidades) {
            System.out.println(nacionalidad);
        }

        System.out.println("\nDIRECTORES");
        for (Director director : directores) {
            System.out.println("ID: " + director.getId() + ", Nombre: " + director.getNombre() + " " + director.getApellidos() + " (" + director.getNacionalidad() + ")");
        }

        System.out.println("\nPELICULAS");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getId() + " - " + pelicula.getTitulo() + " (" + pelicula.getDirector().getNombre() + " " + pelicula.getDirector().getApellidos() + ")");
        }
    }
}

