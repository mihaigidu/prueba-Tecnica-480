public class Main {
    public static void main(String[] args) {
        Cd miCd = new Cd("CD de música", 0.7, "Sony");
        DiscoDuro miHDD = new DiscoDuro("HDD externo", 1024, "Seagate");
        Vinilo vinilo = new Vinilo("Vinilo clásico", 0.5, "Philips");
        BlueRay br = new BlueRay("Pelicula HD", 25, "Panasonic");
        Rueda rueda = new Rueda("Caucho", 18, "Michelin");
        Frisbee frisbee = new Frisbee("Rojo", 25, "Wham-O");


        System.out.println("PRUEBA DEL CD");
        miCd.girarDisco();
        miCd.almacenarDatos("Canciones favoritas");
        miCd.leerDatos();
        miCd.reportarInformacion();


        System.out.println("\nPRUEBA DEL DISCO DURO");
        miHDD.girarDisco();
        miHDD.almacenarDatos("Documentos de trabajo");
        miHDD.leerDatos();
        miHDD.reportarInformacion();

        System.out.println("\nPRUEBA DEL VINILO");
        vinilo.girarDisco();
        vinilo.almacenarDatos("Libros favoritos");
        vinilo.leerDatos();
        vinilo.reportarInformacion();

        System.out.println("\nPRUEBA DEL BLUE RAY");
        br.girarDisco();
        br.almacenarDatos("Peliculas favoritas");
        br.leerDatos();
        br.reportarInformacion();

        System.out.println("\nPRUEBA DE LA RUEDA");
        rueda.girarDisco();

        System.out.println("\nPRUEBA DE LA FRISBEE");
        frisbee.girarDisco();
    }
}
