
public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public static void main(String[] args) {
        Persona persona = new Persona(25, "Juan", "1234567890");

        System.out.println("nombre: " + persona.getnombre());
        System.out.println("edad: " + persona.getedad());
        System.out.println("teléfono: " + persona.gettelefono());

    }

    // Constructor de la clase Persona
    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // metodos getter y setter para acceder a las variables privadas
    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String gettelefono() {
        return telefono;

    }

    public void settelefono(String telefono) {
        this.telefono = telefono;
    }

}
