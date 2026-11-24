import java.util.ArrayList;

interface Figura4 { double area(); }
class Quadrado4 implements Figura4 { double lado; Quadrado4(double lado){this.lado=lado;} public double area(){return lado*lado;} }
class Circulo4 implements Figura4 { double raio; Circulo4(double raio){this.raio=raio;} public double area(){return 3.14159*raio*raio;} }

public class Exerc4 {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Quadrado(2));
        figuras.add(new Circulo(3));
        double total = 0;
        for (Figura figura : figuras) {
            total += figura.area();
        }
        System.out.printf("Total: %.2f%n", total);
    }
}