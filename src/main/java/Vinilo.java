public class Vinilo extends DispositivoAlmacenamiento {

    public Vinilo(String nombre, double capacidad, String Brand) {
        super(nombre, capacidad, "Vinilo", Brand);
    }

    @Override
    public void girarDisco() {
        System.out.println("El vinilo esta girando a 500 RPM ");
    }

    @Override
    public void almacenarDatos(String datos) {
        this.contenido = datos;
        System.out.println("Datos grabados en el vinilo " + datos);
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del vinilo con laser " + contenido);
    }


}
