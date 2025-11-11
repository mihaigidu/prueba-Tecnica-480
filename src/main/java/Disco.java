//se implementa la de giratorio ya que todas las clases en comun + las funcionalidades de las demas clases
public interface Disco extends Giratorio{
    void almacenarDatos(String datos);
    void leerDatos();
    void reportarInformacion();
}
