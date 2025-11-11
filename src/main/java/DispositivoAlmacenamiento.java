
//clase abstrata que implementa la interfaz Disco

public abstract class DispositivoAlmacenamiento implements Disco {

    //atributos y metodos comunes a todos los dispositivos de almacenamiento

    protected String nombre;
    protected double capacidad;
    protected String contenido;
    protected String tipoDeDisco;
    protected String brand;

    // Constructor base que inicializa los campos comunes.

    public DispositivoAlmacenamiento(String nombre, double capacidad, String tipoDeDisco, String brand) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipoDeDisco = tipoDeDisco;
        this.brand = brand;
        this.contenido = "";
    }

    //Metodo comun para mostrar la informacion del disco.

    @Override
    public void reportarInformacion() {
        System.out.println("Nombre: " +  nombre + " capacidad " + capacidad + "GB, contenido: " + contenido + ", Tipo : " + tipoDeDisco);
    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeDisco() {
        return tipoDeDisco;
    }

    public void setTipoDeDisco(String tipoDeDisco) {
        this.tipoDeDisco = tipoDeDisco;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
