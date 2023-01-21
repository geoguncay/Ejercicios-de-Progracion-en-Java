package Variables_y_condicionales.NumMay;

import java.util.Scanner;

public class NumMay {
  /*
   7. Pedir dos números y decir cuál es el mayor.
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el primer número: ");
    double n1 = sc.nextDouble();
    System.out.println("Ingrese el segundo número: ");
    double n2 = sc.nextDouble();
    System.out.println(n1>n2
            ?n1+" es mayor a "+n2
            :n2+" es mayor a "+n1);
  }
}
