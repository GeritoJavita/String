import java.util.Scanner;

public class GetDato {
    

    public int CapturarOpcion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el indice:");
        return scanner.nextInt();
    }

    public void CapturarString(Cadena texto) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cadena:");
        texto.setX(scanner.nextLine());
    }
}
