package biblioteca;

import java.util.ArrayList;

public class Libro extends publicacion {

    //Atributos
    private int NumPag;
    private String edicion;
    private String editorial;
    private persona Autor;

    //constructores
    public Libro (
            persona Autor,
            int NumPag,
            String edicion,
            String editorial,
            String FechaPublicacion,
            String IDPublicacion,
            String codigoBarras) {
        
        //constructor del padre

        super(FechaPublicacion,
                IDPublicacion,
                codigoBarras);
        //ster del libro
    setNumPag(NumPag);
    setEdicion(edicion);
    setEditorial(editorial) ;
    setAutor(Autor);
    
        

    }
    //Metodos

    public void setNumPag(int NumPag) {
        this.NumPag = NumPag;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAutor(persona Autor) {
        this.Autor = Autor;
    }

    public int getNumPag() {
        return NumPag;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public persona getAutor() {
        return Autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "NumPag=" + NumPag + ", edicion=" + edicion + ", editorial=" + editorial + ", Autor=" + Autor +"Publicacion="+super.toString()+ '}';
    }
    
    
    
    

}
