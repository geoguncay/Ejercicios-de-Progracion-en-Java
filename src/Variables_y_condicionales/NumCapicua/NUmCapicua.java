package Variables_y_condicionales.NumCapicua;

import java.util.Scanner;

public class NUmCapicua {
  /*
  13. Pedir un número entre 0 y 9.999, decir si es capicúa.
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    int origi = 0;
    int capi =0;
    do {
      System.out.print("Ingrese un número entre 0 y 9999: ");
      num = sc.nextInt();
    }while (num < 0 || num > 99999);
    
    origi = num;
    
    while (num >0){
      int resto = num % 10;
      capi = capi * 10 + resto;
      num/=10;
    }
    if(origi == capi){
      System.out.println("el capicúa de: "+origi + " es: " + capi);
    }
    else
      System.out.println("El numero no es capicúa");
  }
}
