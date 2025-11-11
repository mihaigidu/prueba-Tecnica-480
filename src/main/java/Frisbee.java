// Clase que representa un frisbee. Implementa Giratorio porque también gira, pero no almacena datos.
public class Frisbee implements Giratorio{

    private String color;
    private double diametro;
    private String brand;

    public Frisbee(String color, double diametro, String brand) {
        this.color = color;
        this.diametro = diametro;
        this.brand = brand;
    }

    @Override
    public void girarDisco() {
        System.out.println("El frisbee esta girando ");
    }

}
