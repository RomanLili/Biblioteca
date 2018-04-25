
package biblioteca;

public class revistaEspecialidad extends Revista {
    //atributos
    private String campoespecializacion;
    //constructores
    public revistaEspecialidad(String campoespecializacion, int numeroTomo, String editorial, String nombreRevista, persona autor, String lugarImpresión, String fp, String ID, String cb) {
        super(numeroTomo, editorial, nombreRevista, autor, lugarImpresión, fp, ID, cb);
        this.campoespecializacion = campoespecializacion;
    }
    //metodos

    public String getCampoespecializacion() {
        return campoespecializacion;
    }

    public void setCampoespecializacion(String campoespecializacion) {
        this.campoespecializacion = campoespecializacion;
    }

    @Override
    public String toString() {
        return "revistaEspecialidad{" + "campoespecializacion=" + campoespecializacion + '}';
    }
    

    
    
    
}
