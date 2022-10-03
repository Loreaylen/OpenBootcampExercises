public class Tema4 {
    public static void main(String[] args){
        // Comparar número para saber si es positivo, negativo o 0
        int numeroIf = -1;
        if (numeroIf > 0) {
            System.out.println("Es positivo");
        }
        else if (numeroIf < 0) {
            System.out.println("Es negativo");
        }
        else {
            System.out.println("Es 0");
        }

        //Bucle While
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        //Bucle Do While
        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        } while(numeroWhile < 3);

        //Bucle For
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        //Switch
        var estacion = "Verano";
        switch(estacion){
            case "Otoño":
                System.out.println("Estamos en otoño");
                break;
            case "Invierno":
                System.out.println("Estamos en invierno");
                break;
            case "Primavera":
                System.out.println("Estamos en primavera");
                break;
            case "Verano":
                System.out.println("Estamos en verano");
                break;
            default:
                System.out.println(estacion);
        }
    }
}
