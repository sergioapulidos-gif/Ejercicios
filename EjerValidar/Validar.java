import java.util.Scanner;

public class Validar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        String name = leer.nextLine();
        
        System.out.println(name + " ingrese su año de nacimiento");
        short actual = 2026;
        short usuario = leer.nextShort();
        
        // Calculamos la edad
        byte edad = (byte)(actual - usuario);
        
        if (edad < 18) {
            System.out.println("No puede entrar");
        } else {
            System.out.println("Bienvenide");
        }
        
        leer.close(); // Buena práctica cerrar el scanner
    }
}