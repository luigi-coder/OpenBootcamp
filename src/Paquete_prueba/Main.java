package Paquete_prueba;

public class Main {

    public static void main(String[] args){

        /*
        Cochecito coche = new Cochecito();
        System.out.println(coche.numeroPuertas);
        System.out.println(coche.velocidadMaxima);
        System.out.println(coche.velocidadActual);

        Cochecito coche2 = new Cochecito(2, 90);
        System.out.println(coche2.numeroPuertas);
        System.out.println(coche2.velocidadMaxima);
        System.out.println(coche2.velocidadActual);
        */

        /*
        Vehiculo auto = new Vehiculo();
        auto.setTipo("Coupe");
        auto.setVelocidadMaxima(120);
        //auto.setRapido(true);
        System.out.println("TIPO VEHICULO: " + auto.getTipo());
        System.out.println("VELOCIDAD MAXIMA: " + auto.getVelocidadMaxima());
        //System.out.println("RAPIDO: " + auto.isRapido());

        Vehiculo moto = new Vehiculo();
        moto.setTipo("Scotter");
        moto.setVelocidadMaxima(50);
        //moto.setRapido(false);
        System.out.println("TIPO VEHICULO: " + moto.getTipo());
        System.out.println("VELOCIDAD MAXIMA: " + moto.getVelocidadMaxima());
        //System.out.println("RAPIDO: " + moto.isRapido());
        */

    }
}

class Cochecito {

    int numeroPuertas;
    int velocidadMaxima;
    float velocidadActual;

    // Sobrecarga de constructores.
    public Cochecito(){
        numeroPuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Estoy en el constructor...");
    }
    public Cochecito(int numeroPuertas, int velocidadMaxima){
        this.numeroPuertas = numeroPuertas;
        this.velocidadMaxima = velocidadMaxima;
        System.out.println("Estoy en el constructor con parametros...");
    }
}

abstract class Vehiculo {

    private String tipo;
    private int velocidadMaxima;
    private String sonido;

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    abstract String isSonido();

    abstract public void setSonido(String sonido);
}