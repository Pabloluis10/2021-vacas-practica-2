package src.tienda;

public class PrestamoPelicula {
    //Atributos;
    private int idPelicula;
    private int idCliente;
    private int diasPrestado;

    //Constructor
    public PrestamoPelicula(int idPelicula, int idCliente, int diasPrestado){
        this.idPelicula = idPelicula;
        this.idCliente = idCliente;
        this.diasPrestado = diasPrestado;
    }

    //getters y setters
    public void setIdPelicula(int idPelicula){
        this.idPelicula = idPelicula;
    }

    public void setIDCliente(int idCliente){
        this.idCliente = idCliente;
    }

    public void setDiasPrestado(int diasPrestado){
        this.diasPrestado = diasPrestado;
    }

    public int getIdPelicula(){
        return idPelicula;
    }

    public int getIdCliente(){
        return idCliente;
    }
    
    public int getDiasPrestado(){
        return diasPrestado;
    }
}
