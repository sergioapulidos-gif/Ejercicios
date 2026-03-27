import java.time.LocalDate;

public class Persona {
    public String name;
    public int id;
    public String nacionalidad;
    public double altura;
    public double peso;
    public LocalDate nacimiento;

    public String mostrar() {
        String datosPersona = this.name + " " + this.nacionalidad;
        return datosPersona;
    }
}