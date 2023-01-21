package Variables_y_condicionales.Ecuacion;

import java.util.Scanner;

public class EcuacionSeg {
  /*
  1. Pedir los coeficientes de una ecuación de 2º grado, y muestre sus soluciones reales. Si no existen, debe indicarlo.
  */
  public static void calcularDeterminante(double a, double b, double c) {
    double det = ((b*b)-4*a*c);
    double divisor = (2*a);
    if (det < 0)
      System.out.println("No es existe una solution");
    else
      if (divisor != 0){
        double x1 = (-b + Math.sqrt(det)) / divisor;
        double x2 = (-b - Math.sqrt(det)) / divisor;
        System.out.println("El valor de x1 es: " + x1);
        System.out.println("El valor de x2 es: " + x2);
      }
      else
        System.out.println("El no es posible dividir para cero");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el valor de a:");
    double a = sc.nextDouble();
    System.out.println("Ingrese el valor de b:");
    double b = sc.nextDouble();
    System.out.println("Ingrese el valor de c:");
    double c = sc.nextDouble();
    calcularDeterminante(a,b,c);
  }
}
