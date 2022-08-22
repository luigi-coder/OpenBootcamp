package Paquete_prueba;

public class Tarea04 {

    public static void main(String[] args){

        Cliente cliente = new Cliente(30, "Luis", "1130990849", 120000);
        System.out.println("CLASE CLIENTE");
        System.out.println(
                "NOMBRE: " + cliente.getNombre() + "\n" +
                "EDAD: " + cliente.getEdad() + "\n" +
                "TELEFONO: " + cliente.getTelefono() + "\n" +
                "CREDITO: " + cliente.getCredito()

        );

        System.out.println("");

        Trabajador trabajador = new Trabajador(31, "Miguel", "1133990899", 90000);
        System.out.println("CLASE TRABAJADOR");
        System.out.println(
                "NOMBRE: " + trabajador.getNombre() + "\n" +
                "EDAD: " + trabajador.getEdad() + "\n" +
                "TELEFONO: " + trabajador.getTelefono() + "\n" +
                "SALARIO: " + trabajador.getSalario()

        );



    }
}

class Persona2 {

    private int edad;
    private String nombre;
    private String telefono;

    public Persona2(int edad, String nombre, String telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

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

class Cliente extends Persona2{

    private int credito;

    public Cliente(int edad, String nombre, String telefono, int credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona2{

    private int salario;

    public Trabajador(int edad, String nombre, String telefono, int salario){
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public int getSalario(){
        return salario;
    }

    public void setSalario(int salario){
        this.salario = salario;
    }
}