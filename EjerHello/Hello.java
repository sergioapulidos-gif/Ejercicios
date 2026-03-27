import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        String name = leer.nextLine();
        
        System.out.println(name + " Hola en Java desde consola");
        System.out.println(name + " ingresa un numero para la tabla");
        
        byte numero;
        numero = leer.nextByte();
        
        System.out.println("La tabla del " + numero + " es:");
        
        byte i = 0;
        // Ciclo para imprimir la tabla
        while (numero >= i) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
            i = (byte)(i + 1);
        }
        
        leer.close();
    }
}