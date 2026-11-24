import java.util.ArrayList;

interface Pagavel { double valorAPagar(); }

class Funcionario implements Pagavel {
    double salario;
    Funcionario(double salario) { this.salario = salario; }
    public double valorAPagar() { return salario; }
}
class Conta implements Pagavel {
    double valor;
    Conta(double valor) { this.valor = valor; }
    public double valorAPagar() { return valor; }
}
public class Exerc5 {
    public static void main(String[] args) {
        ArrayList<Pagavel> lista = new ArrayList<>();
        lista.add(new Funcionario(3000));
        lista.add(new Conta(450));
        double total = 0;
        for (Pagavel pagavel : lista) {
            total += pagavel.valorAPagar();
        }
        System.out.printf("Total a pagar: R$ %,.2f%n", total);
    }
}