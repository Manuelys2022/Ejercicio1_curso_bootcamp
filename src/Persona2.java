public class Persona2 {
    private int edad;
    private String nombre;
    private String telefono;
    public Persona2(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    // Getters y Setters de las propiedades
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
 class Cliente extends Persona2 {
    private double credito;
    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }
    public double getCredito() {
        return credito;
    }
    public void setCredito(double credito) {
        this.credito = credito;
    }
}
class Trabajador extends Persona2 {
    private double salario;
    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Cliente
        Cliente cliente = new Cliente(30, "Juan", "123456789", 5000.0);
        // Mostrar las propiedades del cliente
        System.out.println("Cliente:");
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());
        // Crear un objeto de la clase Trabajador
        Trabajador trabajador = new Trabajador(35, "María", "987654321", 3000.0);
        // Mostrar las propiedades del trabajador
        System.out.println("\nTrabajador:");
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}



