public class Signo {
    public String nombre;
    public String diosAsociado;
    public String cualidad;

    public void mostrarDestino() {
        System.out.println("Tu signo es " + nombre + ".");
        System.out.println("Tu protector/a en el Olimpo es: " + diosAsociado);
        System.out.println("Cualidad divina: " + cualidad);
        System.out.println("------------------------------------");
    }
}