package AYEDT04_TDA_Metodos_Recursivos;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Akin Ramirez
 */
public class TDAMetodosRecursivos {    
    public static void main(String[] args) {
        TDAMetodosRecursivos objEsc = new TDAMetodosRecursivos();
        objEsc.bajarEscalera(10);
    }
    //Creando un metodo para bajar una escalera de manera recursiva
    public void bajarEscalera(int escalones){
        if(escalones <= 0){
            //Caso base, Respuesta explicita
            if(escalones < 0){
                System.out.println("Tiene que ingresar un numeo mayor que cero");
            }else{
                System.out.println("Has terminado de Bajar la Escalera");
            }
        }else{
            try {
                //Dominio, division del problema original (problema - 1)
                Thread.sleep(500);
                System.out.println("Bajando escalon " + escalones);
                //Haciendo uso de la Recursividad
                bajarEscalera(escalones - 1);
            } catch (InterruptedException ex) {
                Logger.getLogger(TDAMetodosRecursivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }    
}
