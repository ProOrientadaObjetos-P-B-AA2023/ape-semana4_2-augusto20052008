package semana4_2_problema2;
class Profesor{
    //atrivutos
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    private Provincia proviencia;
    //constructores
    public Profesor(){}
    public Profesor(String nombre, String apellido, double sueldoBasico, String cedula, Provincia proviencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
        this.proviencia = proviencia;
    }
    //operadores
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    public void setSueldoTotal(double sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void setProviencia(Provincia proviencia) {
        this.proviencia = proviencia;
    }
    public void calcularSueldoTotal(){
        this.sueldoTotal = this.sueldoBasico + (this.sueldoBasico * 0.2);
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public double getSueldoBasico() {
        return sueldoBasico;
    }
    public double getSueldoTotal() {
        return sueldoTotal;
    }
    public String getCedula() {
        return cedula;
    }
    public Provincia getProviencia() {
        return proviencia;
    }
    public String toString() {
        return "Profesor" 
                + "\nNombre= " + nombre 
                + "\nApellido= " + apellido 
                + "\nSueldoBasico= " + sueldoBasico 
                + "\nSueldoTotal= " + sueldoTotal 
                + "\nCedula= " + cedula 
                + "\nProviencia= " + proviencia;
    }
}
class Provincia{
    //Atrivutos
    private String nombre;
    private long numeroHabitante;
    //Constructores
    public Provincia(){}
    public Provincia(String nombre, long numeroHabitante) {
        this.nombre = nombre;
        this.numeroHabitante = numeroHabitante;
    }
    //Operaciones
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumeroHabitante(long numeroHabitante) {
        this.numeroHabitante = numeroHabitante;
    }
    public String getNombre() {
        return nombre;
    }
    public long getNumeroHabitante() {
        return numeroHabitante;
    }
}
public class Semana4_2_Problema2 {
    public static void main(String[] args) {
        Provincia provincia1 = new Provincia ("Zamora Chinchipe",20000);
        Profesor profesor1 = new Profesor("Austo ","Piedra",2000,"1950060794",provincia1);
        profesor1.calcularSueldoTotal();
        System.out.print(profesor1);
    }
}
