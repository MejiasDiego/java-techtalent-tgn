package T10_JavaExceptions;

import java.util.Random;
import java.util.Scanner;

public class password {
    private int longitud = 0;
    private String contraseña = "";
    Scanner scanner = new Scanner(System.in);

    // Constructor sin parámetros
    public password() {
        this.longitud = 0;
        this.contraseña = "";
    }

    // Constructor con parámetro longitud
    public password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword(this.longitud, "");
    }

    // Método para generar la contraseña
    public String generarPassword(int longitud, String contraseña) {
        Random random = new Random();
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String allChars = upperCase + lowerCase + digits;
        StringBuilder password = new StringBuilder();

        // Añadir al menos un dígito y una letra mayúscula
        password.append(digits.charAt(random.nextInt(
        		digits.length())));
        password.append(upperCase.charAt(random.nextInt
        		(upperCase.length())));

        // Completar la contraseña con caracteres aleatorios
        for (int i = 2; i < longitud; i++) {
            password.append(allChars.charAt(random.nextInt
            		(allChars.length())));
        }

        // Mezclar la contraseña para evitar patrones predecibles
        StringBuilder finalPassword = new StringBuilder(password.length());
        while (password.length() > 0) {
            int index = random.nextInt(password.length());
            finalPassword.append(password.charAt(index));
            password.deleteCharAt(index);
        }

        return finalPassword.toString();
    }

    // Método para verificar si la contraseña es fuerte
    public String esFuerte() {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitsCount = 0;

        for (char c : this.contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            } else if (Character.isDigit(c)) {
                digitsCount++;
            }
        }

        return (upperCaseCount > 2 && lowerCaseCount > 1 && digitsCount > 5) ? "Es fuerte" : "No es fuerte";
    }

    // Método para obtener la contraseña generada
    public String getContraseña() {
        return this.contraseña;
    }
}