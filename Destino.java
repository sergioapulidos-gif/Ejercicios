import java.util.Scanner;

public class Destino {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Signo miSigno = new Signo();

        System.out.println("--- CONSULTA TU PROTECTOR DEL OLIMPO ---");
        System.out.println("Ingresa tu signo zodiacal:");
        String input = leer.nextLine().toLowerCase(); // Lo pasamos a minúsculas para evitar errores

        // Lógica para asignar el Dios según el signo
        if (input.equals("aries")) {
            miSigno.nombre = "Aries";
            miSigno.diosAsociado = "Ares";
            miSigno.cualidad = "La valentía en la batalla.";
        } else if (input.equals("tauro")) {
            miSigno.nombre = "Tauro";
            miSigno.diosAsociado = "Afrodita";
            miSigno.cualidad = "La belleza y la persistencia.";
        } else if (input.equals("geminis")) {
            miSigno.nombre = "Géminis";
            miSigno.diosAsociado = "Hermes";
            miSigno.cualidad = "La elocuencia y el ingenio.";
        } else if (input.equals("cancer")) {
            miSigno.nombre = "Cáncer";
            miSigno.diosAsociado = "Artemisa";
            miSigno.cualidad = "La protección y la intuición.";
        } else if (input.equals("leo")) {
            miSigno.nombre = "Leo";
            miSigno.diosAsociado = "Apolo";
            miSigno.cualidad = "El brillo y la creatividad.";
        } else if (input.equals("virgo")) {
            miSigno.nombre = "Virgo";
            miSigno.diosAsociado = "Deméter";
            miSigno.cualidad = "La sabiduría y el orden.";
        } else if (input.equals("libra")) {
            miSigno.nombre = "Libra";
            miSigno.diosAsociado = "Temis";
            miSigno.cualidad = "La justicia y el equilibrio.";
        } else if (input.equals("escorpio")) {
            miSigno.nombre = "Escorpio";
            miSigno.diosAsociado = "Hades";
            miSigno.cualidad = "La transformación y el poder.";
        } else if (input.equals("sagitario")) {
            miSigno.nombre = "Sagitario";
            miSigno.diosAsociado = "Zeus";
            miSigno.cualidad = "La expansión y el liderazgo.";
        } else if (input.equals("capricornio")) {
            miSigno.nombre = "Capricornio";
            miSigno.diosAsociado = "Cronos";
            miSigno.cualidad = "La disciplina y el tiempo.";
        } else if (input.equals("acuario")) {
            miSigno.nombre = "Acuario";
            miSigno.diosAsociado = "Prometeo";
            miSigno.cualidad = "La innovación y la rebeldía.";
        } else if (input.equals("piscis")) {
            miSigno.nombre = "Piscis";
            miSigno.diosAsociado = "Poseidón";
            miSigno.cualidad = "La profundidad y las emociones.";
        } else {
            System.out.println("Signo no reconocido. Intenta escribirlo sin tildes.");
            return; // Sale del programa
        }

        // Llamamos al método de la otra clase
        miSigno.mostrarDestino();
        leer.close();
    }
}