interface Ligavel { void ligar(); }
interface Recarregavel { void recarregar(); }

class Celular implements Ligavel, Recarregavel {
    public void ligar() { System.out.println("Celular ligado."); }
    public void recarregar() { System.out.println("Celular recarregando."); }
}

public class Exerc3 {
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.ligar();
        celular.recarregar();
    }
}
