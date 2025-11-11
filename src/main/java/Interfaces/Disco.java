package Interfaces;

//Se implementa la interfaz giratorio ya que es lo que tienen en comun todos los objetos
public interface Disco extends Giratorio {
    //comportamientos especificos de los dispositivos que almacenan y leen datos
    void almacenarDatos(String datos);
    void leerDatos();
    void reportarInformacion();
}
