package biblioteca;

public class persona{

    //atributos
    private String Nombre;
    private String ApellidoM;
    private String ApellidoP;
    private String Nacionalidad;

    //constructores
    public persona(String Nombre,
            String ApellidoM,
            String ApellidoP,
            String Nacionalidad) {
        setNombre(Nombre);
        setApellidoM(ApellidoM);
        setApellidoP(ApellidoP);
        setNacionalidad(Nacionalidad);

    }
    //medodos

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

}
