//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Empleado empleado1 = new Empleado("Pepe",1500);
        System.out.println(empleado1);
        System.out.println(empleado1.calcularSalario());
        //Programador
        Programador programador1 = new Programador("Java","Luisa",1500);
        System.out.println(programador1);
        System.out.println(programador1.calcularSalario());
        //Gerente
        Gerente gerente1 = new Gerente("Denis",1500,"Marketing");
        System.out.println(gerente1);
        System.out.println(gerente1.calcularSalario());

    }
}