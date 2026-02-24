public class Gerente extends Empleado{
    //Atributos
    private String departamento;
    //Constructor
    public Gerente(String nombre, double salarioBase, String departamento) {
        super(nombre, salarioBase);
        this.departamento=departamento;
    }
    //Métodos
    public double calcularSalario(){
        return super.calcularSalario()+500;
    }
    @Override
    public String toString(){
        return super.toString()+" Departamento: "+departamento;
    }
}
