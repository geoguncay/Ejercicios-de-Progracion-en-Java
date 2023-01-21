package Variables_y_condicionales.NumMayIgual;

import java.util.Scanner;

public class NumMayIgual {
  /*
  8.. Pedir dos números y decir cual es el mayor o si son iguales.
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el primer número: ");
    double n1 = sc.nextDouble();
    System.out.println("Ingrese el segundo número: ");
    double n2 = sc.nextDouble();
    if(n1 == n2)
      System.out.println("Los números son iguales");
    else
      System.out.println(n1>n2
              ?n1+" es mayor a "+n2
              :n2+" es mayor a "+n1);
  }

}
