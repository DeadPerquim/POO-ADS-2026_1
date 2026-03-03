package ads.poo;
import java.util.Random;


public class Main {
    static void main() {
        Random aleatorio = new Random();
        int teclado = -1;
        int min = 1;
        int max = 100;
        int numAleatorio = aleatorio.nextInt((max - min)) + 1;
        teclado = Integer.parseInt(IO.readln("Tente acertar um numero de 1 à 100: "));

        System.out.println();




        System.out.println("Numero Aleatório(1-100): " + numAleatorio);

    }
}
