package semana4_2_problema4;
class cheque{
    private Cliente cliente;
    private Banco banco;
    private double valorCheque;
    private double comisionBanco;
    public cheque(Cliente cliente, Banco banco, double valorCheque) {
        this.cliente = cliente;
        this.banco = banco;
        this.valorCheque = valorCheque;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }
    public void calcularComisionBanco() {
        this.comisionBanco = this.valorCheque*(0.003/100);
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    public Banco getBanco() {
        return this.banco;
    }
    public double getValorCheque() {
        return this.valorCheque;
    }
    public double getcalcularComisionBanco() {
        return this.comisionBanco;
    }
    //Presentacion 
    public String toString(){
        String msj = String.format("""
                                   DATOS DE IDENTIDAD FINANCIERA
                                   
                                   %s 
                                   %s 
                                   Valor del Cheque: %.2f
                                   Año Actual: %.2f
                                   """
                ,this.getCliente()
                ,this.getBanco()
                ,this.getValorCheque()
                ,this.getcalcularComisionBanco());
        return msj;
    }
}
class Cliente{
    private String nombre;
    private String apellido;
    private String cedula;
    public Cliente(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public String getCedula() {
        return this.cedula;
    }
    //Presentacion 
    public String toString(){
        String msj = String.format("""
                                   Cliente:
                                   -Nombre: %s 
                                   -Apellido: %s 
                                   -Cedula: %s
                                   """
                ,this.getNombre()
                ,this.getApellido()
                ,this.getCedula());

        return msj;
    }
}
class Banco{
    private String nombreBanco;
    private long numeroSucursales;
    public Banco(String nombreBanco, long numeroSucursales) {
        this.nombreBanco = nombreBanco;
        this.numeroSucursales = numeroSucursales;
    }
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
    public void setNumeroSucursales(long numeroSucursales) {
        this.numeroSucursales = numeroSucursales;
    }
    public String getNombreBanco() {
        return this.nombreBanco;
    }
    public long getNumeroSucursales() {
        return this.numeroSucursales;
    }
        //Presentacion 
    public String toString(){
        String msj = String.format("""
                                   Banco:
                                   -Nombre del Banco: %s 
                                   -NumeroSucursales: %d 
                                   """
                ,this.getNombreBanco()
                ,this.getNumeroSucursales());

        return msj;
    }
}
public class Semana4_2_Problema4 {
    public static void main(String[] args) {
        Banco banco1 = new Banco("Banco de Loja",10);
        Cliente cliente1 = new Cliente("Augusto","Dávila","Robles");
        cheque cheque1 = new cheque(cliente1,banco1,20000);
        cheque1.calcularComisionBanco();
        System.out.print(cheque1);
    }
}