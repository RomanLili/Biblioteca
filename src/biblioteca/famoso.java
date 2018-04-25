
package biblioteca;

public class famoso extends persona{
    //ATRIBUTOS
    private String ocupacion;
    //CONSTRUCTORES
     public famoso(String ocupacion, String Nombre, String ApellidoM, String ApellidoP, String Nacionalidad) {
        super(Nombre, ApellidoM, ApellidoP, Nacionalidad);
        this.ocupacion = ocupacion;
    }
    
    //METODOS

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "famoso{" + "ocupacion=" + ocupacion + '}';
    }
     

   

    
    
    
}
