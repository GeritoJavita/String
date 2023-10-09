public class Main {
    public static void main(String[] args) {
        MetodosString ob = new MetodosString();
        GetDato ob1 = new GetDato();
        Cadena ob2 = new Cadena();
        Menu menu = new Menu();
        int opcion;

        do {
            opcion = menu.mostrarMenu();
            Casos.procesarOpcion(opcion, ob, ob1, ob2);
        } while (opcion != 0);
    }
}
