public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Trabajador t = new Trabajador();
        c.nombre = "Juan";
        c.edad = 20;
        c.telefono = 123456789;
        c.credito = 1500;

        System.out.println("Nombre CLiente: "+ c.nombre);
        System.out.println("Edad CLiente: "+ c.edad);
        System.out.println("Telefono CLiente: "+ c.telefono);
        System.out.println("Credito CLiente: "+ c.credito);

        t.nombre = "Jose";
        t.edad = 30;
        t.telefono = 987654321;
        t.salario = 2000;

        System.out.println("Nombre Trabajador: "+ t.nombre);
        System.out.println("Edad Trabajador: "+ t.edad);
        System.out.println("Telefono Trabajador: "+ t.telefono);
        System.out.println("Salario Trabajador: "+ t.salario);

    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}