package Variables_y_condicionales.NumPosiNega;

import java.util.Scanner;

public class NumPosiNega {
  /*
   5. Pedir un número e indicar si es positivo o negativo.
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Ingres el numero para comprobar si es positivo o negativo");
    double num = sc.nextDouble();
    System.out.println(num>0
            ? "Es numero es positivo"
            : "Es numero es negativo");
  }
}
