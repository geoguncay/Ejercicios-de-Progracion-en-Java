package Variables_y_condicionales.NumOrdMayMen;

import java.util.*;

public class NumOrdeMayMen {
  /*
  9. Pedir dos números y mostrarlos ordenados de mayor a menor.
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el primer número: ");
    int n1 = sc.nextInt();
    System.out.println("Ingrese el segundo número: ");
    int n2 = sc.nextInt();
    Integer[] lista = new Integer[]{n1, n2};
    System.out.print("Arreglo original: ");
    for (int i : lista) {
      System.out.print(i + " ");
    }
    //Ordenando numeros de mayor a menor con el condicional
    if(n1>n2)
      System.out.println(n1 +" "+n2);
    else
      System.out.println(n2 +" "+n1);
  
    //Ordenando los 2 numeros de la lista con bucle for
    Arrays.sort(lista);
    System.out.print("\nArreglo ordenado: ");
    for (int i = lista.length-1; i >= 0; i--) {
      int a = lista[i];
      System.out.print(a+ " ");
    }
    
    // ordenar los números de mayor a menor manera mas corta
/*    for (int i = 0; i < lista.length / 2; i++) {
      int temp = lista[i];
      lista[i] = lista[lista.length - 1 - i];
      lista[lista.length - 1 - i] = temp;
    }*/
  
  }
}
