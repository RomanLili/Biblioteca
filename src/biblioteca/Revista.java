package biblioteca;
public class Revista extends publicacion {
    ///ATRIBUTOS
    private int numeroTomo;
    private String editorial;
    private String nombreRevista;
    private persona autor;
    private String lugarImpresión;
    //CONSTRUCTORES

    public Revista(int numeroTomo, String editorial, String nombreRevista, persona autor,
            String lugarImpresión, String fp, String ID, String cb) {
        super(fp, ID, cb);
        this.numeroTomo = numeroTomo;
        this.editorial = editorial;
        this.nombreRevista = nombreRevista;
        this.autor = autor;
        this.lugarImpresión = lugarImpresión;
    }
   
    //METODOS

    public int getNumeroTomo() {
        return numeroTomo;
    }

    public void setNumeroTomo(int numeroTomo) {
        this.numeroTomo = numeroTomo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public persona getAutor() {
        return autor;
    }

    public void setAutor(persona autor) {
        this.autor = autor;
    }

    public String getLugarImpresión() {
        return lugarImpresión;
    }

    public void setLugarImpresión(String lugarImpresión) {
        this.lugarImpresión = lugarImpresión;
    }
    
    

    
    
    
    
    
    
}
