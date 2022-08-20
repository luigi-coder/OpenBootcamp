package Paquete_prueba;

public class Tarea01 {
    public static void main(String[] args) {
    /*
    Primera parte:
    * Crear una función con tres parámetros que sean números que se suman entre sí.
    * Llamar a la función en el main y darle valores.
    */

        int resultado = sumarTres(10,20,30);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.incrementarPuertas(1);
        System.out.println("Numero de puertas: " + miCoche.numeroPuertas);

    }
    /*
    Primera parte:
    * Crear una función con tres parámetros que sean números que se suman entre sí.
    * Llamar a la función en el main y darle valores.
    */
    public static int sumarTres(int a, int b, int c){

        return a + b + c;

    }
}
/*
Segunda parte:

* Crear una clase coche.
* Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
* Una función que incremente el número de puertas que tiene el coche.
* Crear un objeto miCoche en el main y añadirle una puerta.
* Mostrar el número de puertas que tiene el objeto.
*/
class Coche {

    int numeroPuertas = 0;

    public int incrementarPuertas(int puerta){

        return this.numeroPuertas += puerta;
    }

}