public class Main {
    public static void main(String[] args) {
        Cd miCd = new Cd("Mi CD de musica ", 0.7, "Sony");
        DiscoDuro miHDD  = new DiscoDuro("DiscoDuro 2025", 1024, "Seagate");


        System.out.println("PRUEBA DEL CD");
        miCd.girarDisco();
        miCd.almacenarDatos("Canciones favoritas");
        miCd.leerDatos();
        miCd.reportarInformacion();
        miCd.reportarInformacion();


        System.out.println("\nPRUEBA DEL DISCO DURO");
        miHDD.girarDisco();
        miHDD.almacenarDatos("Documentos de trabajo");
        miHDD.leerDatos();
        miHDD.reportarInformacion();
    }
}
