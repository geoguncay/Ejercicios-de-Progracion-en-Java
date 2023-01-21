package Variables_y_condicionales.RadioCirculo;

import java.util.Scanner;

public class RadioCirculo {
  /*
  2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double area;
    System.out.println("Ingrese el radio del circulo: ");
    double radio = sc.nextDouble();
    
    area = Math.PI *Math.pow(radio, 2);
    System.out.println("El área del circulo es: " + area);
  }
}
