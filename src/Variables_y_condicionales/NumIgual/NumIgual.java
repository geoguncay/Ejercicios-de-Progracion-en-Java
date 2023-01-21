package Variables_y_condicionales.NumIgual;

import java.util.Scanner;

public class NumIgual {
  /*
  4. Pedir dos números y decir si son iguales o no.
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Ingrese el primer número: ");
    double n1 = sc.nextDouble();
    System.out.println("Ingrese el segundo número: ");
    double n2 = sc.nextDouble();
    if( n1 == n2)
      System.out.println("Los números son iguales");
    else
      System.out.println("Los números no son iguales");
  }
}
