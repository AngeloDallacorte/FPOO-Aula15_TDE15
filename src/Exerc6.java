import java.util.ArrayList;
import java.util.Scanner;

interface Identificavel {
    String identificacao();
}

class Cliente implements Identificavel {
    private String nome, cpf;
    Cliente(String nome, String cpf) { this.nome = nome; this.cpf = cpf; }
    public String identificacao() { return "Cliente: " + nome + " (CPF " + cpf + ")"; }
}

class Funcionario6 implements Identificavel {
    private String nome, matricula;
    Funcionario6(String nome, String matricula) { this.nome = nome; this.matricula = matricula; }
    public String identificacao() { return "Funcionário: " + nome + " (matrícula: " + matricula + ")"; }
}

public class Exerc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Identificavel> cadastro = new ArrayList<>();

        System.out.print("Quantas pessoas? ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Tipo (c/f): ");
            String tipo = sc.next();
            System.out.print("Nome: ");
            String nome = sc.next();
            if (tipo.equalsIgnoreCase("c")) {
                System.out.print("CPF: ");
                String cpf = sc.next();
                cadastro.add(new Cliente(nome, cpf));
            } else {
                System.out.print("Matrícula: ");
                String matricula = sc.next();
                cadastro.add(new Funcionario6(nome, matricula));
            }
        }

        System.out.println("\n=== CADASTRO ===");
        for (Identificavel pessoa : cadastro) {
            System.out.println(pessoa.identificacao());
        }
    }
}