
package biblioteca;

import java.util.ArrayList;

public class revistaEspectaculos  extends Revista{
    //Atributos 
    private int cantidadNotas;
    private ArrayList<famoso> fama;
    //constructores
     public revistaEspectaculos(int cantidadNotas, ArrayList<famoso> fama, int numeroTomo, String editorial, String nombreRevista, persona autor, String lugarImpresión, String fp, String ID, String cb) {
        super(numeroTomo, editorial, nombreRevista, autor, lugarImpresión, fp, ID, cb);
        this.cantidadNotas = cantidadNotas;
        this.fama = fama;
    }
 
    //metodos

    public int getCantidadNotas() {
        return cantidadNotas;
    }

    public void setCantidadNotas(int cantidadNotas) {
        this.cantidadNotas = cantidadNotas;
    }

    public ArrayList<famoso> getFama() {
        return fama;
    }

    public void setFama(ArrayList<famoso> fama) {
        this.fama = fama;
    }
     

   
    
}
