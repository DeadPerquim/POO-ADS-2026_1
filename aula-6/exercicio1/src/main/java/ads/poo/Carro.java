package ads.poo;

public class Carro {
    //Atributos
    private String modelo;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    private static final int VEL_MAX_MODELOS = 300;
    private static final int VEL_MIN_MODELOS = 0;

    public Carro(String modelo, int velocidadeMaxima) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidadeMaxima = VEL_MAX_MODELOS;
    }

    public String getModelo() {
        return modelo;
    }

    public void acelerar(int i){
        velocidadeAtual = (velocidadeAtual+i < velocidadeMaxima) ? velocidadeAtual+i : velocidadeMaxima;
    }

    public void frear(int d){
        velocidadeAtual = (velocidadeAtual-d > VEL_MIN_MODELOS) ? velocidadeAtual-d : VEL_MIN_MODELOS;
    }


}

// Verificar se a constante está sendo utilizada corretamente na classe.
// Verificar o metódo construtor