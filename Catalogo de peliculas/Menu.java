import java.util.Scanner;

public class Menu {
    // atributos
    public int opcion;

    // constructor
    public Menu() {
        this.opcion = menu();
    }

    // metodos
    public int menu() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("____________________________________");

        System.out.println("1.Ingresar una película o serie ");
        System.out.println("2.Prestar una película o serie");
        System.out.println("3.Recibir de regreso una película o serie");
        System.out.println("4.Mostrar películas o series que tienes disponibles");
        System.out.println("5.Eliminar titulo");
        System.out.println("6.Modificar titulo");
        System.out.println("7.Terminar el programa");

        System.out.println("____________________________________");

        System.out.println("ingresa la opcion que deseas hacer");
        this.opcion = teclado.nextInt();
        if (opcion < 1 || opcion > 7) {
            System.out.println("Opción seleccionada no está en la lista");
        }
        return this.opcion;
    }

}
