package Variables_y_condicionales.Notas;

import java.util.Scanner;

public class Notas {
  /*
  14. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nota;
    do{
      System.out.print("Ingrese la nota del 0 al 10: ");
      nota = sc.nextInt();
    }while (nota< 0 || nota > 10 );
    
    if(nota >= 0 && nota < 5){
      System.out.print(nota+ ": Es Insuficiente");
    }
    else {
      if(nota>= 5 && nota< 7 ){
        System.out.print(nota+ ": Es Suficiente");
      }
      else {
        if(nota >= 7 && nota <9){
          System.out.println(nota+ ": Es buena");
        }
        else{
          System.out.println(nota+ ": Es sobresaliente");
        }
      }
    }

  }
}
