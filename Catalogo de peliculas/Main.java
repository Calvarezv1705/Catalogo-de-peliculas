public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Catalogo catalogo = new Catalogo();

        int opcion = menu.opcion;

        while (opcion != 7) {
            if (opcion == 1) {
                catalogo.agregarTitulo();
            } else if (opcion == 2) {
                catalogo.prestarTitulo();
            } else if (opcion == 3) {
                catalogo.recibirTitulo();
            } else if (opcion == 4) {
                catalogo.mostrarTitulos();
            } else if (opcion == 5) {
                catalogo.eliminarTitul0();
            } else if (opcion == 6) {
                catalogo.modificarTitulo();
            }
            opcion = menu.menu();
        }
    }
}
