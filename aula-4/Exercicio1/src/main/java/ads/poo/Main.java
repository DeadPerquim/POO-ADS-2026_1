package ads.poo;

public class Main {
    static void main(String[] args) {

        Lampada a = new Lampada();
        Lampada b = new Lampada();

        a.ligarDesligar();

        System.out.println(a.isLigada());
        System.out.println(b.isLigada());

    }
}
