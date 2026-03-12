package ads.poo;

public class Main{
    static void main() {
        Contador a = new Contador();

        a.setValorAtual(999);
        a.incrementar();
        IO.println(a.getValorAtual());


    }
}