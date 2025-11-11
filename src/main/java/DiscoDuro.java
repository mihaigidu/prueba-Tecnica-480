public class DiscoDuro extends DispositivoAlmacenamiento{

    public  DiscoDuro(String nombre, double capacidad, String Brand) {
        super(nombre, capacidad, "Disco Duro", Brand);
    }

    @Override
    public void girarDisco() {
        System.out.println("El CD esta girando a 500 RPM ");
    }

    @Override
    public void almacenarDatos(String Datos){
        this.contenido = Datos;
        System.out.println("Datos almacenados " + Datos);
    }

    @Override
    public void leerDatos(){
        System.out.println("Leyendo datos " + contenido);
    }


}
