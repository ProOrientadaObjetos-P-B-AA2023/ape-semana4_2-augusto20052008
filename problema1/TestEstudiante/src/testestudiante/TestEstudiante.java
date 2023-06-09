package testestudiante;
class Estudiante{
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private Universidad universidad;
    public Estudiante(String nombre, double nota1, double nota2, double nota3, Universidad universidad) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.universidad = universidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
    public void calcularPromedio(){
        this.promedio = (this.nota1+this.nota2+this.nota3)/3;
    }
    public String getNombre() {
        return this.nombre;
    }
    public double getNota1() {
        return this.nota1;
    }
    public double getNota2() {
        return this.nota2;
    }
    public double getNota3() {
        return this.nota3;
    }
    public double getCalcularPromedio() {
        return this.promedio;
    }
    public Universidad getUniversidad() {
        return this.universidad;
    }
    public String toString() {
        return """
               Estudiante 
               Nombre :""" + nombre 
                + "\nNota1: " + nota1 
                + "\nNota2: " + nota2 
                + "\nNota3: " + nota3 
                + "\nPromedio: " + promedio 
                + "\nUniversidad:" + universidad;
    }
}
class Universidad{
    private String nombre;
    private String direccion; 
    public Universidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public String toString(){
        return String.format("""
                              %s
                             Direccion: %s""", this.getNombre(),this.getDireccion());
    }
}
public class TestEstudiante {
    public static void main(String[] args) {
        Universidad universidad1 = new Universidad ("UTPL","San Cayetano");
        Estudiante estudiante1 = new Estudiante (" Augusto",6,10,10,universidad1);
        estudiante1.calcularPromedio();
        System.out.print(estudiante1);
    }
}
