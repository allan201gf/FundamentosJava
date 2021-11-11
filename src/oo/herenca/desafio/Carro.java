package oo.herenca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    protected int velocidade = 0;

    public Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public boolean acelerar () {

        if (velocidade + 5 > VELOCIDADE_MAXIMA) {
            return false;
        } else {
            velocidade += 5;
            return true;
        }

    }

    public boolean frear () {

        if ( velocidade >= 5 ) {
            velocidade -= 5;
            return true;
        } else {
            return false;
        }

    }

    public String velocidade () {
        return "A velocidade atual é " + velocidade;
    }

}
