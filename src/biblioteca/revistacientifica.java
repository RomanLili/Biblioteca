
package biblioteca;
public class revistacientifica extends Revista {
    //ATRIBUTOS
    private String areaConocimiento;
    private String paisOrigen;
    
    
    //CONSTRUCTORES
    public revistacientifica(String areaConocimiento, String paisOrigen, int numeroTomo, String editorial, String nombreRevista, persona autor, String lugarImpresión, String fp, String ID, String cb) {
        super(numeroTomo, editorial, nombreRevista, autor, lugarImpresión, fp, ID, cb);
        this.areaConocimiento = areaConocimiento;
        this.paisOrigen = paisOrigen;
    }
    
    
    //METODOS

    public String getAreaConocimiento() {
        return areaConocimiento;
    }

    public void setAreaConocimiento(String areaConocimiento) {
        this.areaConocimiento = areaConocimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "revistacientifica{" + "areaConocimiento=" + areaConocimiento + ", paisOrigen=" + paisOrigen + '}';
    }
    
    

    
    
}
