public class Main {
    public static void main(String[] args) {
        coche cocheIncremento = new coche();
        cocheIncremento.incrementar();
        cocheIncremento.incrementar();
        cocheIncremento.incrementar();
        System.out.println("Primera Parte");
        System.out.println("La suma es:_");
        suma(4 , 5 , 6);
        System.out.println("Segunda Parte");
        System.out.println("Puertas Incrementedas despues de 4:_" + cocheIncremento.puertas);

    }
    public static void suma(int a, int b, int c){
        int resultado = 0;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}
//Clase coche
class coche{
    public int puertas = 4;

    public coche(){

    }

    public void incrementar(){
        this.puertas++;
    }
}