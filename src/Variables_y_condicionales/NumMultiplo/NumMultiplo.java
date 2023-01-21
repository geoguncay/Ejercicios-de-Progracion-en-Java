package Variables_y_condicionales.NumMultiplo;

import java.util.Scanner;

public class NumMultiplo {
  /*
  6. Pedir dos números y decir si uno es múltiplo del otro.
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el primer número: ");
    double n1 = sc.nextDouble();
    System.out.println("Ingrese el segundo número: ");
    double n2 = sc.nextDouble();
    System.out.println(n1%n2 == 0
            ?n1+" es múltiplo de "+n2
            :n1+" no es múltiplo de "+n2);
    /*
    if (n1 % n2 ==0 )
      System.out.println(n1 + " es múltiplo del " + n2);
    else
      System.out.println(n1 + " no es múltiplo del " + n2);
    */
  }
}
