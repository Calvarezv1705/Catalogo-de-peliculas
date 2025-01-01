import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Catalogo {
    // atributo
    private ArrayList<Titulo> arr;

    // constructor
    public Catalogo() {
        this.arr = new ArrayList<>();
    }

    // metodos
    public void agregarTitulo() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("____________________________________");

        System.out.println("ingrese el nombre del titulo: ");
        String nombre = teclado.nextLine();

        while (nombre.equals("terminar") != true) {

            System.out.println("____________________________________");

            System.out.println("ingrese el nombre del actor: ");
            String actor = teclado.nextLine();

            System.out.println("____________________________________");

            System.out.println("ingrese el año del titulo: ");
            int año = teclado.nextInt();

            System.out.println("____________________________________");

            System.out.println("ingrese la calificacion(1-10): ");
            int calificacion = teclado.nextInt();

            if (calificacion < 0 || calificacion > 10) {

                System.out.println("____________________________________");

                System.out.println("Error: la calificacion tiene que estar entre 0 y 10");

                System.out.println("____________________________________");

                System.out.println("ingrese la calificacion(1-10): ");
                calificacion = teclado.nextInt();

            }

            System.out.println("____________________________________");

            System.out.println("ingrese la cantidad que va haber de este titulo: ");
            int cantidad = teclado.nextInt();

            System.out.println("____________________________________");

            System.out.println("ingrese el tipo si es pelicula o serie: ");
            String tipoTitulo = teclado.next();

            System.out.println("____________________________________");

            Titulo titulo = new Titulo(nombre, actor, año, calificacion, cantidad, tipoTitulo);

            arr.add(titulo);

            // No supe como organizar un arreglo dinamico por orden alfabetico ent lo busque
            // en la pagina
            // https://www.delftstack.com/es/howto/java/sort-a-list-alphabetically-in-java/#ordenar-una-lista-usando-el-m%c3%a9todo-collectionssort-en-java
            // y chat gpt me explico como implementarlo en el codigo

            Collections.sort(arr, new Comparator<Titulo>() {
                public int compare(Titulo t1, Titulo t2) {
                    return t1.getNombre().compareToIgnoreCase(t2.getNombre());
                }
            });

            System.out.println("ingrese el nombre del titulo (cuando quiera acabar ingrese'terminar'): ");
            teclado.nextLine();
            nombre = teclado.nextLine();

        }
    }

    public void prestarTitulo() {
        Scanner teclado = new Scanner(System.in);
        int n = arr.size();

        System.out.println("____________________________________");

        for (int i = 0; i < n; i++) {
            Titulo titulo = arr.get(i);
            System.out.println(i + ". " + "Nombre: " + titulo.getNombre() + ", Año: " + titulo.getAnio() + ", ("
                    + titulo.getCantidad() + ")");

        }

        System.out.println("____________________________________");

        System.out.println("ingrese el numero de la pelicula o serie que desee prestar");
        System.out.println("si no desea prestar ninguna ingrese -1");
        int numPrestar = teclado.nextInt();

        if (numPrestar >= 0 || numPrestar <= n) {
            for (int i = 0; i <= n; i++) {
                if (i == numPrestar) {
                    Titulo titulo = arr.get(i);
                    int cantidad = titulo.getCantidad();
                    if (cantidad > 0) {
                        titulo.setCantidad(cantidad - 1);

                        System.out.println("____________________________________");

                        System.out.println("se presto la pelicula o serie: " + titulo.getNombre());
                    } else {
                        System.out.println("el titulo " + titulo.getNombre() + " esta agotado por el momento");
                    }
                }
            }
        } else {
            System.out.println("no existe la pelicula o serie que quieres prestar");
        }
    }

    public void recibirTitulo() {
        Scanner teclado = new Scanner(System.in);
        int n = arr.size();

        System.out.println("____________________________________");

        for (int i = 0; i < n; i++) {
            Titulo titulo = arr.get(i);
            System.out.println(i + ". " + "Nombre: " + titulo.getNombre() + ", Año: " + titulo.getAnio() + ", ("
                    + titulo.getCantidad() + ")");
        }

        System.out.println("____________________________________");

        System.out.println(" ");
        System.out.println("ingrese el numero de la pelicula o serie que desee devolver");
        int numRecibir = teclado.nextInt();

        if (numRecibir >= 0 || numRecibir <= n) {
            for (int i = 0; i <= n; i++) {
                if (i == numRecibir) {
                    Titulo titulo = arr.get(i);
                    int cantidad = titulo.getCantidad();
                    titulo.setCantidad(cantidad + 1);

                    System.out.println("____________________________________");

                    System.out.println("se recibio la pelicula o serie: " + titulo.getNombre());
                }
            }
        } else {
            System.out.println("no existe la pelicula o serie que quieres devolver");
        }
    }

    public void mostrarTitulos() {
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            Titulo titulo = arr.get(i);

            System.out.println("____________________________________");

            System.out.println(
                    i + "." + " Nombre: " + titulo.getNombre()
                            + ", Actor: " + titulo.getActor()
                            + ", Año: " + titulo.getAnio()
                            + ", Calificación: " + titulo.getCalificacion()
                            + ", Cantidad: " + titulo.getCantidad()
                            + ", Tipo: " + titulo.getTipoTitulo());
        }
    }

    public void eliminarTitul0() {
        Scanner teclado = new Scanner(System.in);
        int n = arr.size();

        System.out.println("____________________________________");

        for (int i = 0; i < n; i++) {
            Titulo titulo = arr.get(i);
            System.out.println(i + ". " + "Nombre: " + titulo.getNombre() + ", Año: " + titulo.getAnio() + ", ("
                    + titulo.getCantidad() + ")");
        }

        System.out.println("____________________________________");

        System.out.println(" ");
        System.out.println("ingrese el numero de la pelicula o serie que desee eliminar");
        int numEliminar = teclado.nextInt();

        if (numEliminar >= 0 || numEliminar <= n) {
            for (int i = 0; i <= n; i++) {
                if (i == numEliminar) {
                    Titulo titulo = arr.remove(i);

                    System.out.println("____________________________________");

                    System.out.println("se elimino la pelicula o serie: " + titulo.getNombre());
                }
            }
        } else {
            System.out.println("no existe la pelicula o serie que deseeas eliminar");
        }
    }

    public void modificarTitulo() {
        Scanner teclado = new Scanner(System.in);

        int n = arr.size();

        for (int i = 0; i < n; i++) {
            Titulo titulo = arr.get(i);

            System.out.println("____________________________________");

            System.out.println(
                    i + "." + " Nombre: " + titulo.getNombre() + ", Actor: " + titulo.getActor() + ", "
                            + titulo.getAnio()
                            +
                            ", Calificación: " + titulo.getCalificacion() + ", Cantidad: " + titulo.getCantidad() +
                            ", Tipo: " + titulo.getTipoTitulo());

            System.out.println("____________________________________");

        }

        System.out.println("ingrese el numero del titulo que desea modificar;");
        int numTitulo = teclado.nextInt();

        System.out.println("____________________________________");

        for (int i = 0; i < n; i++) {
            Titulo titulo = arr.get(i);
            if (numTitulo == i) {

                System.out.println("1.Nombre:");
                System.out.println("2.Actor:");
                System.out.println("3.Año:");
                System.out.println("4.Calificacion:");
                System.out.println("5.Cantidad:");
                System.out.println("6.Tipo de titulo:");
                System.out.println("7.Terminar");

                System.out.println("____________________________________");

                System.out.println("ingrese el numero del atributo que quiera modificar:");
                int numModificar = teclado.nextInt();

                System.out.println("____________________________________");

                while (numModificar != 7) {
                    if (numModificar == 1) {

                        System.out.println("ingrese el nuevo nombre del titulo:");
                        teclado.nextLine();
                        String nombre = teclado.nextLine();

                        String nombreViejo = titulo.getNombre();
                        System.out.println("____________________________________");

                        titulo.setNombre(nombre);
                        System.out.println("se modifico el Nombre del titulo: " + nombreViejo);

                    } else if (numModificar == 2) {
                        System.out.println("ingrese el nuevo actor del titulo:");
                        teclado.nextLine();
                        String actor = teclado.nextLine();

                        System.out.println("____________________________________");

                        titulo.setActor(actor);
                        System.out.println("se modifico el actor del titulo: " + titulo.getNombre());

                    } else if (numModificar == 3) {
                        System.out.println("ingrese el nuevo actor del titulo:");
                        int anio = teclado.nextInt();

                        System.out.println("____________________________________");

                        titulo.setAnio(anio);
                        System.out.println("se modifico el año del titulo: " + titulo.getNombre());

                    } else if (numModificar == 4) {
                        System.out.println("ingrese la nueva calificacion del titulo:");
                        int calificacion = teclado.nextInt();

                        System.out.println("____________________________________");

                        titulo.setCalificacion(calificacion);
                        System.out.println("se modifico la calificacion del titulo: " + titulo.getNombre());

                    } else if (numModificar == 5) {
                        System.out.println("ingrese la nueva cantidad del titulo:");
                        int cantidad = teclado.nextInt();

                        System.out.println("____________________________________");

                        titulo.setCantidad(cantidad);
                        System.out.println("se modifico la cantidad del titulo: " + titulo.getNombre());

                    } else if (numModificar == 6) {
                        System.out.println("ingrese el nuevo tipo del titulo:");
                        String tipoTitulo = teclado.next();

                        System.out.println("____________________________________");

                        titulo.setTipoTitulo(tipoTitulo);
                        System.out.println("se modifico el tipo del titulo: " + titulo.getNombre());
                    }

                    System.out.println("____________________________________");

                    System.out.println("1.Nombre:");
                    System.out.println("2.Actor:");
                    System.out.println("3.Año:");
                    System.out.println("4.Calificacion:");
                    System.out.println("5.Cantidad:");
                    System.out.println("6.Tipo de titulo:");
                    System.out.println("7.Terminar");

                    System.out.println("____________________________________");

                    System.out.println(
                            "ingrese el numero del atributo que quiera modificar(cuando desee terminar pulse '7'):");
                    numModificar = teclado.nextInt();

                }
            }
        }
    }
}