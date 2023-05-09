class Coche {
    private int numPuertas;
    public Coche() {
        numPuertas = 2;
    }
    public int getNumPuertas() {
        return numPuertas;
    }
    public void incrementarPuertas() {
        numPuertas++;
    }
}
public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("El coche tiene " + miCoche.getNumPuertas() + " puertas.");
    }
}
