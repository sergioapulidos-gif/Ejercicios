import java.time.LocalDate;

public class Futbol {
    public static void main(String args[]) {
        // Persona 1
        Persona p1 = new Persona();
        p1.nacimiento = LocalDate.of(1950, 03, 02);
        p1.name = "Maduro";
        p1.id = 1;
        p1.nacionalidad = "Venezuela";
        p1.altura = 1.93;
        p1.peso = 81.3;

        // Persona 2
        Persona p2 = new Persona();
        p2.name = "Mencho";
        p2.id = 2;
        p2.nacionalidad = "Mexico";

        // Persona 3
        Persona p3 = new Persona();
        p3.name = "Ayatola";
        p3.id = 3;
        p3.nacionalidad = "Iran";

        // Imprimir resultados
        System.out.println("Persona 1: " + p1.mostrar());
        System.out.println("Persona 2: " + p2.mostrar());
        System.out.println("Persona 3: " + p3.mostrar());
    }
}