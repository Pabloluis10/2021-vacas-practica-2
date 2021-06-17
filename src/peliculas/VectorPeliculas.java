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
        entrada.nextLine();
       //creamos pelicula
        peliculas[siguienteCodigo] = new Pelicula((siguienteCodigo+1), nombre, año, categoria, true);
        siguienteCodigo++;
    }

    public void mostrarPeliculas(){
        System.out.println("=========== Las películas de memorambialia ==========");
        for(int i=0; i<siguienteCodigo; i++){
            System.out.println("-> "+(i+1)+ ": "+peliculas[i].getInformacionPeli());
        }
        System.out.println("\n\n");
    }

    public void oredenarAscendente(){
        //metodo por inserción 
        for(int i=0; i<siguienteCodigo; i++){
            Pelicula aux = peliculas[i];
            int pos=i;
            while(pos>0 && (peliculas[pos-1].getNombre().compareToIgnoreCase(aux.getNombre()))>0 ){
                peliculas[pos] = peliculas[pos-1];
                pos--;
            }
            peliculas[pos] = aux;
        }
        System.out.println("========== Las películas se han ordenado en forma ascendente según el nombre ==========");
        mostrarPeliculas();
    }

    public Pelicula[] getPeliculas(){
        return peliculas;
    }
}
