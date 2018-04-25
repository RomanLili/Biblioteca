package biblioteca;
public class periodico extends publicacion{
    //ATRIBUTOS
    private int cantidadSecciones;
    private String nombrePeriodico;
    private String lugarImprecion;
    private int numeroTiraje;
    //CONSTRUCTORES
    public periodico(int cantidadSecciones, String nombrePeriodico, String lugarImprecion, int numeroTiraje, String fp, String ID, String cb) {
        super(fp, ID, cb);
        this.cantidadSecciones = cantidadSecciones;
        this.nombrePeriodico = nombrePeriodico;
        this.lugarImprecion = lugarImprecion;
        this.numeroTiraje = numeroTiraje;
    }
    //METODOS

    public int getCantidadSecciones() {
        return cantidadSecciones;
    }

    public void setCantidadSecciones(int cantidadSecciones) {
        this.cantidadSecciones = cantidadSecciones;
    }

    public String getNombrePeriodico() {
        return nombrePeriodico;
    }

    public void setNombrePeriodico(String nombrePeriodico) {
        this.nombrePeriodico = nombrePeriodico;
    }

    public String getLugarImprecion() {
        return lugarImprecion;
    }

    public void setLugarImprecion(String lugarImprecion) {
        this.lugarImprecion = lugarImprecion;
    }

    public int getNumeroTiraje() {
        return numeroTiraje;
    }

    public void setNumeroTiraje(int numeroTiraje) {
        this.numeroTiraje = numeroTiraje;
    }
    

    
    
    
    
    
}
