package AYEDT03_TDA_Memoria_Dinamica;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Akin Ramirez
 */
public class TDAMemoriaDinamicaClaseArrayList {
    public static void main(String[] args) {
        //ArrayList<String> frases = new ArrayList<> ();
        ArrayList<String> cadenas;//Creando un objeto o instancia de tipo ArrayList
        cadenas = new ArrayList<String>();
        String frase, respuesta;
        
        do{
            frase = JOptionPane.showInputDialog(null,"Ingresa la Frase: ");
            //Agregando frases a la lista
            cadenas.add(frase);
            respuesta = JOptionPane.showInputDialog(null,"Deseas ingresar otra Frase (SI/NO)? ");
            respuesta = respuesta.toUpperCase();            
        }while(!respuesta.equals("NO"));
        
        //Mostrando el contenido de cadenas
        System.out.println("Frases originales");
        for(int i=0;i < cadenas.size();i++){
            System.out.println(cadenas.get(i));
        }
        //Utilizando el metodo set
        cadenas.set(1, "La que modifique");
        //Mostrando el contenido de cadenas ya modificadas
        System.out.println("Frases modificadas");
        for(int i=0;i < cadenas.size();i++){
            System.out.println(cadenas.get(i));
        }
        cadenas.remove(0);
        //Mostrando el contenido de cadenas ya modificadas
        System.out.println("Frases que nos quedan");
        for(int i=0;i < cadenas.size();i++){
            System.out.println(cadenas.get(i));
        }
    }   
}
