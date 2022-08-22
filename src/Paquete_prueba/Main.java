package Paquete_prueba;

public class Main {
    public static void main(String[] args) {


    }
}

interface Vehiculo {

    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Cochecito implements Vehiculo {

    @Override
    public void Acelerar(int cuantaVelocidad) {

    }

    @Override
    public void Frenar(int cuantaVelocidad) {

    }
}

class Moto implements Vehiculo {

    @Override
    public void Acelerar(int cuantaVelocidad) {

    }

    @Override
    public void Frenar(int cuantaVelocidad) {

    }
}

/*
public class Main {

    public static void main(String[] args) {

        Cochecito coche = new Cochecito();
        coche.setSonido("BRRR");
        System.out.println(coche.getSonido());
    }
}

// HERENCIA Y ABSTRACCION
abstract class Vehiculo {
    int velocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo() {
        System.out.println("Estoy en el constructor de Vehiculo");
    }

    abstract String getSonido();

    abstract public void setSonido(String sonido);
}

class Cochecito extends Vehiculo{

    @Override
    String getSonido() {
        return "Soy un super sonido de coche " + this.sonido;
    }

    @Override
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}

class Moto extends Vehiculo{

    @Override
    String getSonido() {
        return "Soy un super sonido de moto " + this.sonido;
    }

    @Override
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}

*/
