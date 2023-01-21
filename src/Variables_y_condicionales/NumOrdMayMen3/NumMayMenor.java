package Variables_y_condicionales.NumOrdMayMen3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NumMayMenor {
  /*
  10. Pedir n números y mostrarlos ordenados de mayor a menor.
  */
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese n numeros para ordenar: ");
    int n = sc.nextInt();
    Integer num [] = new Integer[n];
    //Ingresar datos por teclado
    for(int i = 0; i < num.length ; i++){
      System.out.println("Ingrese el  numero "+(i+1)+" : ");
      num[i] = sc.nextInt();
    }
    System.out.print("Arreglo original: ");
    for(int i :  num){
      System.out.print(i+" ");
    }
    //Ordenando en despondente
    Arrays.sort(num, Collections.reverseOrder());
    
    
    //Mostrar datos por consola
    System.out.print("\nArreglo ordenado: ");
    for (int i : num) {
      System.out.print(i+ " ");
    }
  }
}
