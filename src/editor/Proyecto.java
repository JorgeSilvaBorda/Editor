package editor;

import java.io.File;
import java.util.LinkedList;

/**
 *
 * @author Jorge Silva Borda
 */
public class Proyecto {
    String autor = "";
    String fechaCreacion = "";
    public String ubicacion = "";
    public String nombre = "";
    public String tipo = "";
    public LinkedList<File> archivos = new LinkedList();
    public Proyecto(String nombre, String ubicacion, String tipo, LinkedList<File> archivos){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.archivos = archivos;
    }
    
    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the archivos
     */
    public LinkedList<File> getArchivos() {
        return archivos;
    }

    /**
     * @param archivos the archivos to set
     */
    public void setArchivos(LinkedList<File> archivos) {
        this.archivos = archivos;
    }
}
