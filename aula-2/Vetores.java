public class Vetores {
    void main(){
        //Vetor em Java é um objeto
        int[] vetor = new int[5]; // todas as posições começam com o valor 0

        vetor[0] = 10;
        vetor[4] = 90;

        int[] outra = {3, 4, 5, 8}; // new int[]{2, 4, 5, 7}

        int[][] matriz = new int[3][2]; // lin, col

        matriz[2][1] = 50;

        //vetor de 100 posições e eu quero que iniciem ele com ímpares, começando em 3

        int[] vetorDaora = new int[100];
        
        vetorDaora[0] = 3;
        for(int i = 1; i < vetorDaora.length; i++){
            vetorDaora[i] = vetor[i-1] + 2;
            System.out.println(vetorDaora[i]);
        }
    }
    
}


// 1 2 3
// 4 5 6
// 7 8 9