public class Conversor {

    // a) Convertir entero a binario de 8 bits
    public static String enteroABinario(int numero) {
        // Esto garantiza que el resultado esté en 8 bits, llenando con ceros a la izquierda si es necesario.
        return String.format("%8s", Integer.toBinaryString(numero & 0xFF)).replace(' ', '0');
    }

    // b) Convertir binario de 8 bits a su complemento a dos
    public static String binarioAComplementoA2(String binario) {
        // Verificar que la cadena tenga exactamente 8 bits
        if (binario.length() != 8) {
            throw new IllegalArgumentException("La cadena debe tener exactamente 8 bits.");
        }

        // Iniciar el número con 0
        int numero = 0;

        // Convertir el binario a su valor numérico
        for (int i = 0; i < binario.length(); i++) {
            numero <<= 1; // Desplazar un bit a la izquierda
            if (binario.charAt(i) == '1') {
                numero |= 1; // Sumar 1 si el bit actual es 1
            }
        }

        // Aplicar complemento a dos
        numero = ~numero; // Invertir todos los bits
        numero &= 0xFF; // Asegurarse de que siga siendo un número de 8 bits
        numero += 1; // Sumar uno al resultado invertido

        // Convertir de vuelta a binario
        String resultado = Integer.toBinaryString(numero & 0xFF);

        // Asegurarse de que el resultado sea de 8 bits
        resultado = String.format("%8s", resultado).replace(' ', '0');

        return resultado;
    }

    // c) Convertir hexadecimal de 3 dígitos a decimal y viceversa
    public static int hexadecimalADecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static String decimalAHexadecimal(int numero) {
        // Esto garantiza que el resultado esté en 3 dígitos hexadecimales, llenando con ceros a la izquierda si es necesario.
        return String.format("%3s", Integer.toHexString(numero & 0xFFF)).replace(' ', '0').toUpperCase();
    }
}
