package AYEDT07_Torre_de_Hanoi;

/**
 *
 * @author Akin Ramirez
 */
public class TDATorreDeHanoi {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    TDATorreDeHanoi objHanoi = new TDATorreDeHanoi();
    objHanoi.torresHanoi(3, 1, 2, 3);
    System.out.println("Juego Completado!!!");
  }
  //Implementando el metodo recursivo para solucionar las Torres de Hanoi

  public void torresHanoi(int discos, int torre1, int torre2, int torre3) {
    //Caso base
    if (discos == 1) {
      System.out.println("Movel Disco de Torre " + torre1 + " a Torre " + torre3);
    } else {
      //Dominio
      torresHanoi(discos - 1, torre1, torre3, torre2);
      System.out.println("Movel Disco de Torre " + torre1 + " a Torre " + torre3);
      torresHanoi(discos - 1, torre2, torre1, torre3);
    }
  }
}
