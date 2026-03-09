public class Empleado {
    //Atributos
    private String nombre;
    private double salarioBase;
    //Constructor
    public Empleado(String nombre, double salarioBase){
        this.nombre=nombre;
        this.salarioBase=salarioBase;
    }
    //Setters y getters

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public String getNombre() {
        return nombre;
    }

    //Métodos//
    public double calcularSalario(){
        return this.salarioBase;
    }
    @Override
    public String toString(){
        return "Nombre: "+nombre+" Salario base: "+salarioBase;
    }
}
