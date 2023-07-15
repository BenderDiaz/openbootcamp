
class Persona {
    protected int edad;
    protected String nombre;
    protected String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Crédito: " + credito);
    }
}

class Trabajador extends Persona {
    private double salario;

    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Salario: " + salario);
    }

    public class Main {
        public static void main(String[] args) {
            Cliente cliente = new Cliente(30, "Juan", "123456789", 5000.0);
            cliente.mostrarInformacion();

            Trabajador trabajador = new Trabajador(25, "Pedro", "987654321", 2000.0);
            trabajador.mostrarInformacion();
        }
    }

}
