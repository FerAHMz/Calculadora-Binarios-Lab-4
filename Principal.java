import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nPor favor, elige una opción:");
            System.out.println("1. Convertir número entero a binario de 8 bits");
            System.out.println("2. Convertir número binario de 8 bits a complemento a dos");
            System.out.println("3. Convertir entre hexadecimal de 3 dígitos y decimal");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un número entero: ");
                    int numeroEntero = scanner.nextInt();
                    System.out.println("El número " + numeroEntero + " en binario es: " + Conversor.enteroABinario(numeroEntero));
                    break;
                case 2:
                    System.out.print("Ingresa un número binario de 8 bits: ");
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    String binario8Bits = scanner.nextLine();
                    System.out.println("El complemento a dos de " + binario8Bits + " es: " + Conversor.binarioAComplementoA2(binario8Bits));
                    break;
                case 3:
                    System.out.println("a) Convertir de hexadecimal a decimal.");
                    System.out.println("b) Convertir de decimal a hexadecimal.");
                    System.out.print("Elige una opción (a/b): ");
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    String subopcion = scanner.nextLine();

                    if (subopcion.equalsIgnoreCase("a")) {
                        System.out.print("Ingresa un número en hexadecimal de 3 dígitos: ");
                        String hex = scanner.nextLine();
                        System.out.println("El número hexadecimal " + hex + " en decimal es: " + Conversor.hexadecimalADecimal(hex));
                    } else if (subopcion.equalsIgnoreCase("b")) {
                        System.out.print("Ingresa un número decimal entre (0 - 4095): ");
                        int numeroDecimal = scanner.nextInt();
                        System.out.println("El número decimal " + numeroDecimal + " en hexadecimal es: " + Conversor.decimalAHexadecimal(numeroDecimal));
                    } else {
                        System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}


