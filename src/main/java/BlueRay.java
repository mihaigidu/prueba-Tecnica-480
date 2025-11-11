public class BlueRay extends DispositivoAlmacenamiento {

    //Esta clase tambien puede heredar de dispositivo Almacenamiento y comparte metodos y atributos

    public BlueRay(String nombre, double capacidad, String Brand){
        super(nombre, capacidad, "BlueRay", Brand);
    }


    @Override
    public void girarDisco() {
        System.out.println("El BlueRay esta girando a 500 RPM ");

    }

    @Override
    public void almacenarDatos(String datos) {
        this.contenido = datos;
        System.out.println("Datos grabados con laser azul en el BLueRay " + datos);
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del BlueRay con laser azul: " + contenido);
    }
}
