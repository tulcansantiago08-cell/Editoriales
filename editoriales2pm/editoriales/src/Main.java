import Model.Idioma;
import Model.Libro;
import Model.Video;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // --- Libro ---
        System.out.println("=== Crear un Libro ===");
        System.out.println("Titulo del libro:");
        String tituloLibro = input.nextLine();
        System.out.println("Precio:");
        double precioLibro = input.nextDouble();
        System.out.println("Anio de publicacion:");
        int anioPublicacion = input.nextInt();
        System.out.println("Numero de paginas:");
        int numeroPaginas = input.nextInt();
        input.nextLine(); // limpiar buffer

        Libro miLibro = new Libro(tituloLibro, precioLibro, anioPublicacion, numeroPaginas);
        System.out.println("\n" + miLibro);

        // --- Video ---
        System.out.println("\n=== Crear un Video ===");
        System.out.println("Titulo del video:");
        String tituloVideo = input.nextLine();
        System.out.println("Precio:");
        double precioVideo = input.nextDouble();
        System.out.println("Duracion en horas:");
        float duracionHoras = input.nextFloat();
        input.nextLine(); // limpiar buffer
        System.out.println("Idioma (1=ESPAÑOL, 2=INGLES, 3=PORTUGUES):");
        int opcion = input.nextInt();

        Idioma idioma;
        switch (opcion) {
            case 2: idioma = Idioma.INGLES; break;
            case 3: idioma = Idioma.PORTUGUES; break;
            default: idioma = Idioma.ESPAÑOL; break;
        }

        Video miVideo = new Video(tituloVideo, precioVideo, idioma, duracionHoras);
        System.out.println("\n" + miVideo);

        input.close();
    }
}