public class Casos {
    
    public static void procesarOpcion(int opcion, MetodosString ob, GetDato ob1, Cadena ob2) {
        switch (opcion) {
            case 1:
                ob1.CapturarString(ob2);
                int longitud = ob.Logintud(ob2);
                System.out.println("La longitud de la cadena es: " + longitud);
                break;
            case 2:
                ob1.CapturarString(ob2);
                String invertida = ob.Invertir(ob2);
                System.out.println("La cadena invertida es: " + invertida);
                break;
            case 3:
                ob1.CapturarString(ob2);
                String substring = ob.SubString(ob2);
                System.out.println("El SubString es: " + substring);
                break;
            case 4:
                ob1.CapturarString(ob2);
                String acotado = ob.SubStrignAcotado(ob2);
                System.out.println("El substring acotado es: " + acotado);
                break;
            case 5:
                ob1.CapturarString(ob2);
                char caracter = ob.Caracter(ob2);
                System.out.println("El caracter obtenido es: " + caracter);
                break;
            case 6:
                ob1.CapturarString(ob2);
                String concatenacion = ob.Concatenacion(ob2);
                System.out.println("La concatenación es: " + concatenacion);
                break;
            case 7:
                ob1.CapturarString(ob2);
                String contieneCadena = ob.CadenaConCadena(ob2);
                System.out.println(contieneCadena);
                break;
            case 8:
                ob1.CapturarString(ob2);
                String igualdad = ob.igualdad(ob2);
                System.out.println(igualdad);
                break;
            case 0:
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
