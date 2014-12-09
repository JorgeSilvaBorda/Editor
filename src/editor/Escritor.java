package editor;
import java.io.*;
/**
 * @author comandante
 */
public class Escritor {
    private String texto;
    private Object[] objeto;
    
    public Escritor(){
        
    }
    public Escritor(String txt){
        this.setTexto(txt);
    }
    public Escritor(Object[] obj){
        this.setObjeto(obj);
    }
    public boolean setTexto(String txt){
        try{
            this.texto = txt;
        }catch(Exception e){
            return false;
        }
        return true;
    }
    public boolean setObjeto(Object[] obj){
        try{
            this.objeto = obj;
        }catch(Exception e){
            return false;
        }
        return true;
    }
    public Object[] escribirConfig(Configuracion c, String ruta){
        Object[] resp = new Object[2];
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        int n;
        try{
            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(ruta));
            file.writeObject(c);
            file.close();
            resp[0] = true;
            resp[1] = "Se ha guardado la configuración.";
        }catch(IOException e){
            resp[0] = false;
            resp[1] = "Ocurrió un problema al guardar la configuración.";
            System.out.println("Ocurrió un problema al intentar guardar el archivo de configuración.\n"+e);
            return resp;
        }
        return resp;
    }
}
