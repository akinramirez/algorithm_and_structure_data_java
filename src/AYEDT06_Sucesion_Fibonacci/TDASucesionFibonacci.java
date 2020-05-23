package AYEDT06_Sucesion_Fibonacci;

/**
 *
 * @author Akin Ramirez
 */
public class TDASucesionFibonacci {

  public static void main(String[] args) {
    TDASucesionFibonacci objFibo = new TDASucesionFibonacci();
    int numero = 4;
    System.out.println("La Sucesion Fibonacci de " + numero + " mediante recursividad es: "
            + objFibo.fibonacciRecursivo(numero));
    System.out.println("La Sucesion Fibonacci de " + numero + " mediante ciclo while es: "
            + objFibo.fibonacciCiclo(numero));
    System.out.println("La Sucesion Fibonacci de " + numero + " mediante ciclo for es: "
            + objFibo.fibonacciCiclo(numero));
  }
  //Creando base (Respuesta Explicita

  public int fibonacciRecursivo(int n) {
    if (n == 1 || n == 2) {
      //Caso Base (Respuesta Explicita)
      return 1;
    } else {
      //Dominio (Problema -1)
      return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
  }

  //Creando el mnetodo con ciclo while para la recursion fibonacci
  public int fibonacciCiclo(int n) {
    int fibo = 0, primero = 1, segundo = 0;
    while (n > 0) {
      fibo = primero + segundo;
      primero = segundo;
      segundo = fibo;
      n--;
    }
    return fibo;
    //Prueba de escritorio
    //n=4-1=3-1=2-1=1-1=0    fibo=0=1=1=2=3    primero=1=0=1=1=2   segundo=0=1=1=2=3
  }

  //Creando el mnetodo con ciclo for para la recursion fibonacci
  public int fibonacciCicloFor(int n) {
    int fibo = 0, primero = 1, segundo = 0;

    for (int i = 0; i < n; i++) {
      fibo = primero + segundo;
      primero = segundo;
      segundo = fibo;
      n--;
    }
    return fibo;
  }

}
