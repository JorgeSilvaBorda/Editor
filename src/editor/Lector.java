package editor;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author comandante
 */
public class Lector {
    public Lector(){
        
    }
    public Configuracion leerConfig(String ruta){
        Configuracion respuesta = new Configuracion();
        try {
            //Stream para leer archivo
            ObjectInputStream file = new ObjectInputStream(new FileInputStream(ruta));
            //Se lee el objeto de archivo y este debe convertirse al tipo de clase que corresponde
            respuesta = (Configuracion) file.readObject();
            //se cierra archivo
            file.close();
            //Se utilizan metodos de la clase asi como variables guardados en el objeto
        } catch (ClassNotFoundException ex) {
            System.out.println("Error 1");
             System.out.println(ex);
        } catch (IOException ex) {
            System.out.println("Error 2");
             System.out.println(ex);
       }
        return respuesta;
    }
}
