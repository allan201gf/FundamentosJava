package oo.herenca.desafio;

/*
 * criar velocidade atual
 * criar metodo acelerar (acelera de 5 em 5)
 * criar metodo frear (freia de 5 em 5)
 * a velocidade nunca pode ser menor do que zero
 *
 * Dentro da ferrari acelera de 15 em 15;
 * Civic continua de 5 em 5
 */


public class Ferrari extends Carro implements Esportivo {

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override // indica que o metodo está sendo sobescrito
    public boolean acelerar () {
        boolean acelera1 = super.acelerar();
        boolean acelera2 = super.acelerar();
        boolean acelera3 = super.acelerar();
        return acelera1 || acelera2 || acelera3;

        // Pode ser utilizado também velocidade += 15 e void;
    }

    @Override
    public void ligarTurbo() {

        velocidade += 35;

    }

    @Override
    public void desligarTurbo() {

        velocidade -= 35;

    }

}
