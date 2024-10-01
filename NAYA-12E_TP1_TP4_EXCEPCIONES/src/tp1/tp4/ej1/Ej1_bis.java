package tp1.tp4.ej1;

	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class Ej1_bis {
		
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        int numero = 0;
	        System.out.println("valor de la variable numero1: " + numero);
	        // try {
	            System.out.print("Ingrese un numero: ");
	            numero = Integer.parseInt(input.nextLine());
	        // } catch (NumberFormatException e) {
	        //     System.out.println("Error. Se produjo un error en la carga: " + e.getMessage());
	        // } finally {
	        //     System.out.println("Ahora la variable numero1 vale: " + numero);
	        // }
	        System.out.println("Ahora la variable numero1 vale: " + numero); // Puede lanzar una excepción si hay un error.
	        System.out.println("\n*********\n");

	        // Volvemos a probar, pero usando nextInt (genera otra excepción)
	        numero = 0;
	        // try {
	            System.out.println("valor de la variable numero2: " + numero);
	            System.out.print("Ingrese un numero: ");
	            numero = input.nextInt();
	        // } catch (InputMismatchException e) {
	        //     System.out.println("Error. Se produjo un error en la carga.");
	        // } finally {
	        //     input.nextLine();
	        //     System.out.println("Ahora la variable numero2 vale: " + numero);
	        // }
	        // Sin manejo de excepcione.  el programa se para si se ingresa un valor no numerico
	        System.out.println("Ahora la variable numero2 vale: " + numero);
	        
	        // Encapsulo para capturar un
	        // nro sin errores de carga 

	        System.out.println("\n*********\n");

	        numero = pedirNumeroEntero(input);
	        System.out.println("El numero ingresado fue " + numero + ".");

	        input.close();
	    }

	    public static int pedirNumeroEntero(Scanner input) {
	        int numero = 0;
	        boolean ok = false;
	        while (!ok) {
	            try {
	                System.out.print("Ingrese numero entero: ");
	                numero = Integer.parseInt(input.nextLine());
	                ok = true;
	            } catch (NumberFormatException e) {
	                System.out.println("Error. Ingrese un numero correcto");
	            }
	        }
	        return numero;
	    }
	}


