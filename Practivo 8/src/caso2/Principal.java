package caso2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    private static final String NOMBRE_ARCHIVO = "file.txt";


    public static void divisionSegura(Scanner scanner) {
        System.out.println("Division Segura");
        try {
            System.out.print("Introduce el dividendo (numero 1): ");
            double dividendo = scanner.nextDouble();
            System.out.print("Introduce el divisor (numero 2): ");
            double divisor = scanner.nextDouble();

            if (divisor == 0) {

                throw new ArithmeticException("Error: Division por cero no permitida.");
            }

            double resultado = dividendo / divisor;
            System.out.println("Resultado de la division: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("**Error de entrada:** Debes introducir numeros validos.");
            scanner.next(); 
        } catch (ArithmeticException e) {
            System.out.println("**Error:** " + e.getMessage());
        }
    }

    public static void conversionCadenaANumero(Scanner scanner) {
        System.out.println("Conversion de Cadena a Numero");

        if (scanner.hasNextLine()) {
            scanner.nextLine(); 
        }
        System.out.print("Introduce una cadena para convertir a entero: ");
        String texto = scanner.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Conversion exitosa. El numero es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("**Error de formato:** La cadena '" + texto + "' no es un numero entero valido.");
        }
    }

    public static void lecturaDeArchivo() {
        System.out.println("Lectura de Archivo (sin try-with-resources)");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(NOMBRE_ARCHIVO);
            System.out.println("Contenido del archivo " + NOMBRE_ARCHIVO + ":");
            int caracter;
            while ((caracter = fileReader.read()) != -1) {
                System.out.print((char) caracter);
            }
            System.out.println(); 
        } catch (FileNotFoundException e) {
            System.out.println("**Error de archivo:** El archivo '" + NOMBRE_ARCHIVO + "' no fue encontrado.");
        } catch (IOException e) {
            System.out.println("**Error de I/O:** Ocurrio un error al leer el archivo: " + e.getMessage());
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("**Error al cerrar:** No se pudo cerrar el recurso.");
                }
            }
        }
    }

    public static void validarEdad(int edad) throws Exception {
        if (edad < 0 || edad > 100) {
            throw new Exception("La edad debe estar entre 0 y 120. Valor ingresado: " + edad);
        }
        System.out.println("Edad validada correctamente: " + edad);
    }

    public static void ejecutarExcepcionPersonalizada(Scanner scanner) {
        System.out.println("Excepcion Personalizada (EdadInvalidaException)");
        try {
            System.out.print("Introduce una edad: ");
            int edad = scanner.nextInt();
            validarEdad(edad);
        } catch (InputMismatchException e) {
            System.out.println("**Error de entrada:** Debes introducir un número entero.");
            scanner.next(); 
        } catch (Exception e) {

            System.out.println("**Excepcion Capturada:** " + e.getMessage());
        }
    }

    public static void lecturaConTryWithResources() {
        System.out.println("try-with-resources");
        
        try (BufferedReader reader = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
            System.out.println("Contenido del archivo " + NOMBRE_ARCHIVO + " (con try-with-resources):");
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("**Error de archivo:** El archivo '" + NOMBRE_ARCHIVO + "' no fue encontrado.");
        } catch (IOException e) {
            System.out.println("**Error de I/O:** Ocurrió un error al leer: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        divisionSegura(scanner);
        conversionCadenaANumero(scanner);
        lecturaDeArchivo(); 
        ejecutarExcepcionPersonalizada(scanner);
        lecturaConTryWithResources(); 

        scanner.close();

    }
}