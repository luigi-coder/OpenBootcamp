package Paquete_prueba;

public class Principal {

    public static void main(String[] args) {


        int contador = 10;

        System.out.println("BUCLE WHILE");
        while(contador > 0){
            System.out.println(contador);
            contador--;
        }

        System.out.println("BUCLE DO WHILE");
        do{
            System.out.println(contador);
            contador--;

        }while(contador > 0);

        // FOR
        System.out.println("BUCLE FOR");
        for (int contadorF = 1; contadorF <= 10; contadorF = contadorF+1){
            System.out.println(contadorF);
        }

        int valores[] = {10,20,30,40,50};

        for (int i=0; i < valores.length; i++){

            System.out.println(valores[i]);
        }

        // SWITCH

        System.out.println("Switch");
        var estacion = "verano";

        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Estoy en el default");

        }
    }
}


