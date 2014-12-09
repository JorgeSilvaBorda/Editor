package editor;

import java.io.Serializable;

/**
 * @author comandante
 */
public class Configuracion implements Serializable {
    private static final long serialVersionUID = 666L;
    String tipo;
    Object[] params;
    public Configuracion(String tip, Object[] par){
        this.tipo = tip;
        this.params = par;
    }
    public Configuracion(){

    }
    public String getTipo(){
        return this.tipo;
    }
    public Object getParams(){
        return this.params;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public void setParams(Object[] p){
        this.params = p;
    }
    public Object[] getTodo(){
        Object[] salida = {tipo, params};
        return salida;
    }
    public void muestraContenido(){
        System.out.println("El tipo de configuración es: "+tipo);
        for(Object o : params){
            System.out.println((String)o);
        }
    }
}
