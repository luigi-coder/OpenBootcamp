package Paquete_prueba;

public class Tarea02 {

    public static void main(String[] args) {

        /*
        Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        */
        int numeroIf = 10;

        if(numeroIf > 0){
            System.out.println("Positivo");
        }else if(numeroIf < 0){
            System.out.println("Negativo");
        }else if(numeroIf == 0){
            System.out.println("Cero");
        }else{
            System.out.println("Valor invalido");
        }

        /*
        Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile
        sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        * Incrementar el valor de la variable en uno cada vez que se ejecute.
        * Mostrarlo por pantalla cada vez que se ejecute.
        */
        System.out.println("BUCLE WHILE");
        int numeroWhile = 0;

        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        /*
        Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se
        debe ejecutar una vez.
        */

        System.out.println("BUCLE DO WHILE");
        int numeroDoWhile = 0;

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        }while(numeroDoWhile < 1);

        /*
        Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición
        será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se
        ejecute y deberá mostrarse por pantalla.
        */
        System.out.println("BUCLE FOR");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){

            System.out.println(numeroFor);
        }

        /*
        Por último, para el Switch, deberás crear la variable estacion, y distintos case para las
        cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar
        un mensaje por consola informando de la estación en la que está. También habrá que poner
        un default para cuando el valor de la variable no sea una estación.
        */
        System.out.println("SWITCH CASE");
        var estacion = "verano";

        switch (estacion){
            case "verano":
                System.out.println("VERANO");
                break;
            case "invierno":
                System.out.println("INVIERNO");
                break;
            case "otoño":
                System.out.println("OTOÑO");
                break;
            case "primavera":
                System.out.println("PRIMAVERA");
                break;
            default:
                System.out.println("EL VALOR DE LA VARIABLE NO ES UNA ESTACION");

        }
    }
}
