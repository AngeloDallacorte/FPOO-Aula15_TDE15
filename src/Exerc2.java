interface Figura2 {
    double area();
    double perimetro();
}
class Retangulo implements Figura {
    double largura, altura;
    Retangulo(double largura, double altura) { this.largura = largura; this.altura = altura; }
    public double area() { return largura * altura; }
    public double perimetro() { return 2 * (largura + altura); }
}
public class Exerc2 {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(4, 3);
        System.out.printf("Área %.1f, perímetro %.1f%n", retangulo.area(), retangulo.perimetro());
    }
}
