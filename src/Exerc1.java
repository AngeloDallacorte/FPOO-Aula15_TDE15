interface Figura {
    double area();
}
class Quadrado implements Figura {
    double lado; Quadrado(double lado){this.lado=lado;}
    public double area(){ return lado*lado; }
}
class Circulo implements Figura {
    double raio; Circulo(double raio){this.raio=raio;}
    public double area(){ return 3.14159*raio*raio; }
}
public class Exerc1 {
    public static void main(String[] args) {
        Figura[] figuras = { new Quadrado(3), new Circulo(1) };
        for (Figura figura : figuras) {
            System.out.printf("%.2f%n", figura.area());
        }
    }
}