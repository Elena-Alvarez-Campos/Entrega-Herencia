public class Programador extends Empleado {
    //Atributos
    private String lenguajeDominante;
    //Constructor
    public Programador(String lenguajeDominante, String nombre, double salarioBase){
        super(nombre, salarioBase);
        this.lenguajeDominante=lenguajeDominante;
    }
    //Getters y Setters
    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }
    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    //Métodos
    public double calcularSalario(){
        return super.calcularSalario()+super.calcularSalario()*0.1;
    }
    @Override
    public String toString(){
        return super.toString()+" Lenguaje Dominante: "+lenguajeDominante;
    }
}
