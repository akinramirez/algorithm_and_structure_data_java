package AYEDT02_TDA_Memoria_Estatica;

/**
 *
 * @author Akin Ramirez
 */
import java.util.Arrays;
import javax.swing.JOptionPane;

public class MemoriaEstaticaClaseArrays {
    public static void main(String[] args) {
        int numeros [] = new int [5];
        int numerotes [] = new int [numeros.length];
        String palabras [] = new String[5];
        int i;
        
        for( i=0;i<5;i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento del indice " + i));
        }
        //Mostrando los datos como los ingresamos
        System.out.println("Los datos sin ordenar son: ");
        for(i=0;i<5;i++){
            System.out.print("["+numeros[i]+"]");
        }
        System.out.println("\nLos datos ordenados son: ");
        Arrays.sort(numeros); // Aqui ordenamos al arreglo numeros
        for(i=0;i<5;i++){
            System.out.print("["+numeros[i]+"]");            
        }
        System.out.print("\n");
        //Rellenando al arreglo palabras
        Arrays.fill(palabras, "Bienvenido a la Fiesta!");
        System.out.println("Elementos del arreglo palabras");
        for(i=0;i<5;i++){
            System.out.println("["+palabras[i]+"]");
        }
        //Copiando los elementos del arreglo numeros a numerotes
        System.arraycopy(numeros,0,numerotes, 0, numeros.length);
        System.out.print("\nElementos del arreglo n");
        System.out.print("\n");
        for(i=0;i<5;i++){
            System.out.print("["+numerotes[i]+"]");
        }
    }
    
}
