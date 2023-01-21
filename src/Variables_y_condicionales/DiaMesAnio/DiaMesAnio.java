package Variables_y_condicionales.DiaMesAnio;

import java.util.Scanner;

public class DiaMesAnio {
  /*
  15. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.
  */
  public static void main(String[] args) {
    int dia, mes, anio;
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el día: "); // dia 1...30
    dia = sc.nextInt();
    System.out.print("Ingrese el mes: "); //mes 1...12
    mes = sc.nextInt();
    System.out.print("Ingrese el año: "); //año 1900...2050
    anio = sc.nextInt();
    
    
    if(dia >= 0 && dia <= 30){
      if(mes >= 1 && mes <= 12){
        if (anio >= 1990 && anio <= 2050){
          System.out.print("La fecha es correcta: ");
        }
        else
          System.out.print("Año incorrecto: ");
      }
      else
        System.out.println("Mes incorrecto");
    }
    else
      System.out.println("Dia incorrecto");
  }
}
