package tp1.tp4.tj3;

import java.time.Year;
import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
        int nacimiento = 0;
        int fallecimiento = 0;
        Scanner input = new Scanner(System.in);
        LectorEnteros lector = new LectorEnteros(input);

     
        int anioActual = Year.now().getValue();
        nacimiento = lector.pedir("Ingrese el año de nacimiento", 1900, anioActual);

      
        fallecimiento = lector.pedir("Ingrese el año de fallecimiento (-1 si la persona vive)", 
                                      new RangoDeEnteros(-1, anioActual));

       
        int edad = (fallecimiento == -1) ? anioActual - nacimiento : fallecimiento - nacimiento;
        boolean vive = (fallecimiento == -1);

        System.out.println("Edad de la persona: " + edad + " años.");
        System.out.println("La persona " + (vive ? "vive." : "no vive."));

        input.close();
    }
}
