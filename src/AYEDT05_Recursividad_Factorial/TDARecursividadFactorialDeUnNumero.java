package AYEDT05_Recursividad_Factorial;

/**
 *
 * @author Akin Ramirez
 */
public class TDARecursividadFactorialDeUnNumero {

  public static void main(String[] args) {
    TDARecursividadFactorialDeUnNumero objFact = new TDARecursividadFactorialDeUnNumero();
    System.out.println("EL factorial de 4 mediante Metodo Recursivo es : "
            + objFact.factorialRecursivo(4));

    System.out.println("EL factorial de 4 mediante un Metodo con ciclo es : "
            + objFact.factorialCicloWhile(4));

    System.out.println("EL factorial de 4 mediante un Metodo con ciclo es : "
            + objFact.factorialCicloFor(4));
  }

  //4! = 1 * 2 * 3 * 4 = 24
  //Creando el metodo factorial de manera recursiva
  public int factorialRecursivo(int n) {
    //Validando
    if (n < 0) {
      return 0;
    } else {
      //Caso Base
      if (n == 0) {
        return 1;
      } else {
        //Dominio (problema - 1)
        return n * factorialRecursivo(n - 1);
      }
    }
  }

  //Creando metodo factorial mediante ciclo while
  public int factorialCicloWhile(int n) {
    if (n < 0) {
      return 0;
    } else {
      int factor = 1;
      while (n != 0) {
        factor = n * factor;
        n--;
      }
      return factor;
    }
  }

  //Creando metodo factorial mediante ciclo for
  public int factorialCicloFor(int n) {
    if (n < 0) {
      return 0;
    } else {
      int factor = 1;
      for (int i = 0; i <= n; i++) {
        factor = n * factor;
        n--;
      }
      return factor;
    }
  }
}
