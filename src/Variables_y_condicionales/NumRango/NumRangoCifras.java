package Variables_y_condicionales.NumRango;

import java.util.Scanner;

public class NumRangoCifras {
  /*
  11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
  */
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese un numero: ");
    double numero = teclado.nextDouble();
    int cifras = 0;
    
    if (numero >=0 && numero <=9999){
     if (numero ==0){
       cifras = 1;
     }
     else{
       while (numero>=1){
         cifras++;
         numero/=10;
       }
     }
      System.out.println("El numero tiene"+cifras);
    }
    else{
      System.out.println("El numero "+numero+" se encuentra fuera de rango");
    }
    
  }
}
