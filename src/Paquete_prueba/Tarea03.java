package Paquete_prueba;

public class Tarea03 {

    public static void main(String[] args){

        Persona luis = new Persona();
        luis.setEdad(30);
        luis.setNombre("Luis");
        luis.setTelefono("1130990849");

        System.out.println(
                "NOMBRE: " + luis.getNombre() + "\n" +
                "EDAD: " + luis.getEdad()   + "\n" +
                "TELEFONO: " + luis.getTelefono()
        );
    }
}

class Persona{

    private int edad;
    private String nombre;
    private String telefono;

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