package ads.poo;

public class Caneta {
    private String cor; //**
    private double nivelTinta; // 0.0
    private boolean tampada; // false


    public String desenhar(int x1, int y1, int x2, int y2){
        if (tampada == false) {

            double distanciaX = Math.pow(x2 - x1, 2);
            double distanciaY = Math.pow(y2 - y1, 2);

            double distancia = Math.sqrt(distanciaX + distanciaY);

            double consumo = distancia * 0.01;

            if (nivelTinta >= consumo){
                nivelTinta -= consumo;
                return String.format("desenhei %.2f na cor %s", distancia, cor);
            };

            return "Não tem tinta suficiente";

        }else{
            return ("Está Tampada, não pode desenhar nada");
        }





    }

    //calcular a distância
    //debitar do nivel de tinta
    //retornar a distância percorrida
    //Ex: Desenhei 1cm na cor azul



































    public boolean isTampada() {return tampada;}
        boolean tamparDestampar(){
        tampada = !tampada;
        return tampada;
        }

        public void abrirTampa(){
            tampada = false;
        }

        public void fecharTampa(){
            tampada = true;
        }
        public String getCor(){
            return cor;
        }

        public  double getNivelTinta(){
            return nivelTinta;
        }

        public void setCor(String c){
            cor = c;
        }

        public void setNivelTinta(double d){
            nivelTinta = d;
        }


}
