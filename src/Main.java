//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void holaMundo() {
        System.out.println("Hola, Mundo!");
    }

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option;

        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Número par o impar");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    holaMundo();
                    break;
                case 2:
                    Suma();
                    break;
                case 3:
                    Par_o_impar();
                    break;
                case 4:
                    factorial();
                case 5:
                    tabla_de_multiplicar();
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (option != 6);

        scanner.close();
    }

    static void Suma() {
        System.out.println("digite el numero 1");
        int num1 = scanner.nextInt();
        System.out.println("digite el numero 2");
        int num2 = scanner.nextInt();
        int resultado = num1 + num2;
        System.out.println("el resultado es " + resultado);
    }

    static void Par_o_impar() {
        System.out.println("digite el numero ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " es un numero par");
        } else {
            System.out.println(num + " es un numero impar");
        }

    }

    static void factorial() {
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);
    }

    static void tabla_de_multiplicar() {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Tabla ascendente
        System.out.println("\nTabla de multiplicar del " + numero + " (Ascendente):");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Tabla descendente
        System.out.println("\nTabla de multiplicar del " + numero + " (Descendente):");
        for (int i = 10; i >= 1; i--) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }


    }

}