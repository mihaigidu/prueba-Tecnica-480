package Dispositivos;

import Base.DispositivoAlmacenamiento;

// Clase concreta que representa un CD. Hereda de DispositivoAlmacenamiento.
public class Cd extends DispositivoAlmacenamiento {
    public Cd (String nombre, double capacidad, String Brand) {
        super(nombre, capacidad, "Dispositivos.Cd", Brand);

    }


    @Override
    public void girarDisco() {
        System.out.println("El CD esta girando a 500 RPM ");
    }

    @Override
    public void almacenarDatos(String datos) {
        this.contenido = datos;
        System.out.println("Datos guardados en el CD " + datos);
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del CD con laser " + contenido);
    }
}
