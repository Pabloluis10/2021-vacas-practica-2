package src.peliculas;

import java.util.*;

public class VectorPeliculas {

    private Pelicula[] peliculas = new Pelicula [50];
    private int siguienteCodigo;
    private Scanner entrada = new Scanner(System.in);

    public VectorPeliculas() {
        siguienteCodigo = 0;
    }

    //metodos
    public void agregarPelicula(){
        if(siguienteCodigo >= 50){
            System.out.println("¡Ya no se puede ingresar películas límite alcanzado!");
            return;
        }
        System.out.print("Ingrese el nombre de la película: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese la categoria de la película: ");
        String categoria = entrada.nextLine();
        System.out.print("Ingrese el año de la película: ");
        int año = entrada.nextInt();

        //creamos pelicula
        peliculas[siguienteCodigo] = new Pelicula(siguienteCodigo, nombre, año, categoria, true);
        siguienteCodigo++;
    }
}
