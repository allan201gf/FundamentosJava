package oo.herenca.teste;

import oo.herenca.desafio.Carro;
import oo.herenca.desafio.Civic;
import oo.herenca.desafio.Ferrari;

public class TesteDesafio {

    public static void main(String[] args) {

        Carro carro1 = new Carro(120);

        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();

        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear(); // Não considera pois o carro está parado

        System.out.println(carro1.velocidade());

        Ferrari ferrari1 = new Ferrari(300);

        ferrari1.acelerar();

        ferrari1.ligarTurbo();

        System.out.println(ferrari1.velocidade());

        Carro civic1 = new Civic(200);

        civic1.acelerar();

        System.out.println(civic1.velocidade());

    }
}
