//solo se implementa la interfaz de giratorio porque, Rueda no almacena informacion
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
