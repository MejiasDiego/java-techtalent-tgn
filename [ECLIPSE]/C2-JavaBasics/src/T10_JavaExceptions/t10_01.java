package T10_JavaExceptions;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class t10_01 {
    Random random = new Random();
    int numeroRandom = random.nextInt(501); 
    
    public static void main(String[] args) {
        t10_01 numeroAzar = new t10_01();

        System.out.println("Juguemos a adivinar"
        		+ " un número del 0 al 500.");

        Scanner scanner = new Scanner(System.in);
        int numeroUsuario = -1; 
        int intentos =0;
        try {
        	  while (numeroUsuario != numeroAzar.numeroRandom) {
                  if (intentos == 0) {
                      System.out.print("\nIntroduce un "
                      		+ "número para empezar: ");
                  } else {
                      System.out.print("\nIntroduce otro número: ");
                  }
                  try {
                      numeroUsuario = scanner.nextInt();
                      intentos++;

                      int comparacion;
                      if (numeroUsuario < numeroAzar.numeroRandom) {
                          comparacion = -1; // El número del usuario es menor
                      } else if (numeroUsuario > numeroAzar.numeroRandom) {
                          comparacion = 1; // El número del usuario es mayor
                      } else {
                          comparacion = 0; // El número del usuario es igual
                      }

                      switch (comparacion) {
                          case -1:
                              System.out.println("El número introducido es "
                              		+ "menor que el número aleatorio.");
                              break;
                          case 1:
                              System.out.println("El número introducido es "
                              		+ "mayor que el número aleatorio.");
                              break;
                          case 0:
                              System.out.println("¡Felicidades! Has adivinado el número. "
                              		+ "\nNúmero de intentos: " + intentos);
                              break;
                          default:
                              System.out.println("Error en la comparación.");
                              break;
                      }
                  } catch (InputMismatchException e) {
                      System.out.println("Entrada inválida. Has perdido un intento."
                      		+ " Por favor, introduce un número entero.");
                      intentos++;
                      scanner.next(); 
                  }
              }

        					} finally {
     
        					scanner.close();
        }
    }
}