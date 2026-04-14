package poo.ads;

public class Main {
    static void main(String[] args) {

        Motor simples = new Motor();

        Carro fusca = new Carro("VW", simples);
        fusca = null;

        Carro ferrari = new Carro ("ferrari", simples);

        Livro livro = new Livro("Java como programar", new  Pessoa("Deitel", "123", "d@d"));

        livro.adicionarCapitulo("Introdução");
        livro.adicionarCapitulo("Andamento");
        livro.adicionarCapitulo("Conclusão");

    }
}
