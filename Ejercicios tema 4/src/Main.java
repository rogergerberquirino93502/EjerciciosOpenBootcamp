public class Main {
    public static void main(String[] args) {
        int numeroIf = 5;
        int numeroWhile = 0;
        int numeroFor= 0;
        var estacion = "PRIMAVERA";


        if (numeroIf > 0) {
            System.out.println("Es Positivo");
        } else {
            System.out.println("Es Negativo");
        }

        while (numeroWhile < 3) {
            System.out.println("Do "+numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        do {
            System.out.println("Do While "+numeroWhile);
            numeroWhile = numeroWhile + 1;
        }while (numeroWhile<3);

        for (; numeroFor <=3; numeroFor=numeroFor+1){
            System.out.println("For "+numeroFor);
        }

        switch(estacion){
            case "VERANO":
                System.out.println("Switch "+"Es verano");
                break;
            case "OTOÑO":
                System.out.println("Switch "+"Es otoño");
                break;
            case "INVIERNO":
                System.out.println("Switch "+"Es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Switch "+"Es primavera");
                break;
            default:
                System.out.println("Default: No esta incluido");
        }

    }
}