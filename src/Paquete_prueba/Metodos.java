package Paquete_prueba;

public class Metodos {

    public static void main(String[] args){

        var valor1 = 10;
        var valor2 = 20;

        // Paso por valor, hace una copia de las variables NO RECOMENDADO
        suma(valor1, valor2);

        // Paso por referencia, manipulamos la misma variable(objeto)
        Cochecito2 coche2 = new Cochecito2();
        CocheChanger(coche2);
        CocheChanger(coche2);
        System.out.println(coche2.velocidad);

        Cochecito2 coche = new Cochecito2();
        Moto2 moto = new Moto2();
        EjecutaAcelerar(coche);
        EjecutaAcelerar(moto);

    }

    // clase que implementa la interface Vehiculo => Cochecito
    public static void EjecutaAcelerar(Vehiculo2 vehiculo){

        vehiculo.Acelerar(15);
    }

    // Paso por referencia
    public static void CocheChanger(Cochecito2 coche){
        coche.velocidad += 50;
    }

    public static int suma(int a, int b){
        return a + b;
    }
}

interface Vehiculo2 {

    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Cochecito2 implements Vehiculo2 {

    int velocidad = 50;
    @Override
    public void Acelerar(int cuantaVelocidad) {
        System.out.println("Coche => Acelerar...");
    }

    @Override
    public void Frenar(int cuantaVelocidad) {
        System.out.println("Coche => Frenar...");
    }
}

class Moto2 implements Vehiculo2 {

    @Override
    public void Acelerar(int cuantaVelocidad) {
        System.out.println("Moto => Acelerar...");
    }

    @Override
    public void Frenar(int cuantaVelocidad) {
        System.out.println("Moto => Frenar...");
    }
}