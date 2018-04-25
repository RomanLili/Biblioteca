
package biblioteca;

public class Autor extends persona{
    //ATRIBUTOS
    private String generoLiterario;
    //CONSTRUCTORES
    public Autor(String generoLiterario, String Nombre, String ApellidoM, String ApellidoP, String Nacionalidad) {
        super(Nombre, ApellidoM, ApellidoP, Nacionalidad);
        this.generoLiterario = generoLiterario;
    }
    //METODOS

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    @Override
    public String toString() {
        return "Autor{" + "generoLiterario=" + generoLiterario + '}';
    }
    

    
    
    
}
