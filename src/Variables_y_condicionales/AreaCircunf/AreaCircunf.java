package Variables_y_condicionales.AreaCircunf;

import java.util.Scanner;

public class AreaCircunf {
  /*
   3. Pedir el radio de una circunferencia y calcular su longitud. L=2*PI*r.
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double longitud;
    System.out.print("Ingrese el radio de la circunferencia: ");
    double radio = sc.nextDouble();
    longitud = 2*Math.PI*radio;
    System.out.println("La longitud de la circunferencia es: " +longitud);
  }
}
