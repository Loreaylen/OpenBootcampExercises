public class Main {
    public static void main(String[] args) {
       System.out.println(suma(5,20,3));

       Coche miCoche = new Coche();
       miCoche.AgregarPuerta();
       System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 3;

    public void AgregarPuerta() {
        this.puertas++;
    }
}