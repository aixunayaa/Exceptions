package tp1.tp4.tj3;

import java.util.Scanner;

public class LectorEnteros {
	private static final String MENSAJE_ERROR_SCANNER_NULL = "Debe recibirse un Scanner.";
	private static final String MENSAJE_CARGA_ENTERO = "Ingrese un numero entero cualquiera";
	private static final String MENSAJE_FUERA_DE_RANGO = "El valor ingresado esta fuera del rango aceptable";

	private Scanner scanner;

	private int cargar(String mensaje) {
		System.out.println(mensaje);
		return Integer.parseInt(scanner.nextLine());
	}
	public LectorEnteros(Scanner scanner) {
		 if (scanner == null) {
	            throw new IllegalArgumentException(MENSAJE_ERROR_SCANNER_NULL);
	        }
	        this.scanner = scanner;
	}

	public int pedir(String mensaje) {
		int valor;
        while (true) {
            try {
                System.out.print(mensaje + ": ");
                valor = Integer.parseInt(scanner.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero.");
            }
        }
	}

	public int pedir(String mensaje, int limiteA, int limiteB){
		RangoDeEnteros rango = new RangoDeEnteros(limiteA, limiteB);
        int valor;
        do {
            valor = pedir(mensaje + " (entre " + limiteA + " y " + limiteB + ")");
            if (!rango.incluye(valor)) {
                System.out.println("Error: " + valor + " está fuera del rango aceptable.");
            }
        } while (!rango.incluye(valor));
        return valor;
	}

	public int pedir(String mensaje, RangoDeEnteros rangoValido){
		if (mensaje == null || rangoValido == null) {
            throw new IllegalArgumentException("El mensaje y el rango no pueden ser nulos.");
        }
        if (mensaje.isEmpty()) {
            mensaje = "Ingrese un valor";
        }

        int valor;
        do {
            valor = pedir(mensaje);
            if (!rangoValido.incluye(valor)) {
                System.out.println("Error: " + valor + " está fuera del rango aceptable.");
            }
        } while (!rangoValido.incluye(valor));
        return valor;
	}
}
