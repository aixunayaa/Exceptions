package tp1.tp4.ej2;

import java.util.Scanner;

import tp1.tp4.tj3.LectorEnteros;
import tp1.tp4.tj3.RangoDeEnteros;

public class Ej2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Alumno alu = null;
        int dni = 0, anioNacimiento = 0;
        String nombreCompleto;

        while (alu == null) {
            try {
                System.out.print("Ingrese el DNI ");
                dni = input.nextInt();
                input.nextLine(); 
                System.out.print("Ingrese el nombre completo ");
                nombreCompleto = input.nextLine();
                System.out.print("Ingrese el año de nacimiento ");
                anioNacimiento = input.nextInt();
                System.out.print("¿La persona vive? ");
                boolean vive = input.nextBoolean();

                alu = new Alumno(dni, nombreCompleto, anioNacimiento, vive);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: ");
                input.nextLine(); 
            }
        }
        input.close();
        System.out.println(alu.toString());

        if (alu.vive()) {
            System.out.println("La persona vive");
        } else {
            System.out.println("La persona no vive");
        }
    }
}