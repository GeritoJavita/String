import java.util.Scanner;

public class Menu {
     public int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una opción:");
        System.out.println("1. Calcular longitud de la cadena");
        System.out.println("2. Invertir la cadena");
        System.out.println("3. Obtener SubString");
        System.out.println("4. Obtener SubString Acotado");
        System.out.println("5. Obtener un caracter de la cadena");
        System.out.println("6. Concatenar dos cadenas");
        System.out.println("7. Cadena dentro de la cadena");
        System.out.println("8. Si las cadenas son iguales");
        return scanner.nextInt();
    }
}
