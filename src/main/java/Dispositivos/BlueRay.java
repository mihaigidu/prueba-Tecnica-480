package Dispositivos;

import Base.DispositivoAlmacenamiento;

// Clase concreta que representa un disco Dispositivos.BlueRay. Hereda de DispositivoAlmacenamiento.
public class BlueRay extends DispositivoAlmacenamiento {

    public BlueRay(String nombre, double capacidad, String Brand) {
        super(nombre, capacidad, "Dispositivos.BlueRay", Brand);
    }

    @Override
    public void girarDisco() {
        System.out.println("El Dispositivos.BlueRay está girando a 1000 RPM.");
    }

    @Override
    public void almacenarDatos(String datos) {
        this.contenido = datos;
        System.out.println("Datos grabados con láser azul en el Dispositivos.BlueRay: " + datos);
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del Dispositivos.BlueRay con láser azul: " + contenido);
    }
}
