package semana4_2_problema3;
class Automotor{
    //atrivutos
    private String cedulaDueno;
    private Fabricante fabricanteVehiculo;
    private long anioFabricante;
    private double valorVehiculo;
    private double valorMatricula;
    private long anioActual;
    //constructores
    public Automotor(String cedulaDueno, Fabricante fabricanteVehiculo, long anioFabricante, long anioActual, double valorVehiculo) {
        this.cedulaDueno = cedulaDueno;
        this.fabricanteVehiculo = fabricanteVehiculo;
        this.anioFabricante = anioFabricante;
        this.anioActual = anioActual;
        this.valorVehiculo = valorVehiculo;
    }
    //operaciones 
    public void setCedulaDueno(String cedulaDueno) {
        this.cedulaDueno = cedulaDueno;
    }
    public void setFabricanteVehiculo(Fabricante fabricanteVehiculo) {
        this.fabricanteVehiculo = fabricanteVehiculo;
    }
    public void setAnioFabricante(long anioFabricante) {
        this.anioFabricante = anioFabricante;
    }
    public void setAnioActual(long anioActual) {
        this.anioActual = anioActual;
    }
    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }
    public void calcularValorMatricula() {
        this.valorMatricula = (((0.002/100)*this.valorVehiculo) *(this.anioActual-this.anioFabricante));
    }
    public String getCedulaDueno() {
        return this.cedulaDueno;
    }
    public Fabricante getFabricanteVehiculo() {
        return this.fabricanteVehiculo;
    }
    public long getAnioFabricante() {
        return this.anioFabricante;
    }
    public long getAnioActual() {
        return this.anioActual;
    }
    public double getValorVehiculo() {
        return this.valorVehiculo;
    }
    public double getValorMatricula() {
        return this.valorMatricula;
    }
        //Presentacion 
    public String toString(){
        String msj = String.format("""
                                   DATOS SOBRE AUTOMOTOR
                                   Cedula dueño: %s 
                                   Fabricante de Vehiculo: %s 
                                   Año de Fabricacion: %d
                                   Año Actual: %d
                                   Valor de Vehiculo: %.2f
                                   Valor de Matricula: %.2f
                                   """
                ,this.getCedulaDueno()
                ,this.getFabricanteVehiculo()
                ,this.getAnioFabricante()
                ,this.getAnioActual()
                ,this.getValorVehiculo()
                ,this.getValorMatricula());
        return msj;
    }
}
class Fabricante{
    //atrivutos
    private String nombre;
    private String ciudad;
    //constructores
    public Fabricante(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    //operaciones
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    public String toString(){
        return String.format("""
                              %s
                             Ciudad: %s""", this.getNombre(),this.getCiudad());
    }
}
public class Semana4_2_Problema3 {
    public static void main(String[] args) {
        Fabricante fabricante1 = new Fabricante("Augusto Davila","Zamora");
        Automotor automotor1 = new Automotor("1950060796",fabricante1,2005,2023,20220);
        automotor1.calcularValorMatricula();
        System.out.print(automotor1);
    }  
}
