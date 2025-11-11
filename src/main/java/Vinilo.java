// Clase concreta que representa un disco de vinilo. Hereda de DispositivoAlmacenamiento.
public class Vinilo extends DispositivoAlmacenamiento {

    public Vinilo(String nombre, double capacidad, String Brand) {
        super(nombre, capacidad, "Vinilo", Brand);
    }

    @Override
    public void girarDisco() {
        System.out.println("El vinilo está girando a 33 RPM.");
    }

    @Override
    public void almacenarDatos(String datos) {
        this.contenido = datos;
        System.out.println("Datos grabados físicamente en surcos del vinilo: " + datos);
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del vinilo con aguja: " + contenido);
    }
}
