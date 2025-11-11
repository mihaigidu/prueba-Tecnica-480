// Clase que representa una rueda. Implementa Giratorio, ya que gira pero no almacena datos.
public class Rueda implements Giratorio {
    private String material;
    private double diametro;
    private String brand;

    public Rueda(String material, double diametro, String brand) {
        this.material = material;
        this.diametro = diametro;
        this.brand = brand;
    }

    @Override
    public void girarDisco(){
        System.out.println("La rueda esta girando el coche");
    }
}
