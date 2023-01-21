package Variables_y_condicionales.NumRangoReves;

import java.util.Scanner;

public class NumRangoReves {
  /*
  12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dm, um, c, d, u, num;
    
    //Pedir un número mientras no cumpla con las condiciones
    do{
      System.out.print("Ingrese el numero entre 0 y 9999: ");
      num = sc.nextInt();
    }while (num < 0 || num > 9999);
    
    //Ordenar forma ascendente no recomendada
    u = num%10; //unidad
    num = num/10;
    
    d = num%10; //decena
    num = num/10;
    
    c = num%10; //centena
    num = num/10;
    
    um = num%10; //unidad de mil
    num = num/10;
    
    dm = num%10; //decena de mil
  
    System.out.println(u+""+d+""+c+""+um+""+dm);
    
    //Ordenar forma descendente recomendada
    while (num>0){
      int resto = num%10;
      System.out.print(resto);
      num /= 10;
    }
  }
}
