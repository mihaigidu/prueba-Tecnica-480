public abstract class DispositivoAlmacenamiento implements Disco {

    protected String nombre;
    protected double capacidad;
    protected String contenido;
    protected String tipoDeDisco;
    protected String Brand;

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

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
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

    public DispositivoAlmacenamiento(String nombre, double capacidad, String tipoDeDisco, String brand) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipoDeDisco = tipoDeDisco;
        this.Brand = brand;
        this.contenido = "";
    }


    @Override
    public void reportarInformacion() {
        System.out.println("Nombre: " +  nombre + " capacidad " + capacidad + "GB, contenido: " + contenido + ", Tipo : " + tipoDeDisco);
    }
}
