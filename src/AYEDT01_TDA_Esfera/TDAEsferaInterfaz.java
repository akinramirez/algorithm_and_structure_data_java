package AYEDT01_TDA_Esfera;

/**
 *
 * @author Akin Ramirez
 */
public class TDAEsferaInterfaz {

    public static void main(String[] args) {
        TDAEsferaImplementacion esferita = new TDAEsferaImplementacion(4);
        System.out.println("Radio: " + esferita.getRadio());
        System.out.println("Diametro: " + esferita.getDiametro());
        System.out.println("Circuferencia: " + esferita.getCircuferencia());
        System.out.println("Area: " + esferita.getArea());
        System.out.println("Volument: " + esferita.getVolumen());
    }   
}
