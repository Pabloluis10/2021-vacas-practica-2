package src.peliculas;

public class Pelicula {
    
    //Atributos
    private int id;
    private String nombre;
    private int año;
    private String categoria;
    private boolean disponible;

    //constructor
    public Pelicula(int id, String nombre, int año, String categoria, boolean disponible){
        this.id = id;
        this.nombre = nombre;
        this.año = año;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    //getters & setters
    public void setId(int id){
        this.id = id;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setAño (int año){
        this.año = año;
    }

    public void setCategoria (String categoria){
        this.categoria = categoria;
    }

    public void setDisponible (boolean disponible){
        this.disponible = disponible;
    }

    public int getId (){
        return id;
    }

    public String getNombre () {
        return nombre;
    }

    public int getAño(){
        return año;
    }

    public String getCategoria(){
        return categoria;
    }

    public boolean getDisponible(){
        return disponible;
    }

    public String getInformacionPeli(){
        String resultado = "Id: "+id+" Nombre de la película: "+nombre+" Categoria: "+categoria+" Año: "+año+" Disponible: "+disponible;
        return resultado;
    }
}