public class Titulo {

    // atributos
    private String nombre;
    private String actor;
    private int anio;
    private int calificacion;
    private int cantidad;
    private String tipoTitulo;

    // constructor
    public Titulo(String nombre, String actor, int año, int calificacion, int cantidad, String tipoTitulo) {
        this.nombre = nombre;
        this.actor = actor;
        this.anio = año;
        this.calificacion = calificacion;
        this.cantidad = cantidad;
        this.tipoTitulo = tipoTitulo;
    }

    // seters y geters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoTitulo() {
        return tipoTitulo;
    }

    public void setTipoTitulo(String tipoTitulo) {
        this.tipoTitulo = tipoTitulo;
    }
}
