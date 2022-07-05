package CursoJavaLeonardoLeitao.oo.herenca.teste;

import CursoJavaLeonardoLeitao.oo.herenca.Direcao;
import CursoJavaLeonardoLeitao.oo.herenca.Heroi;
import CursoJavaLeonardoLeitao.oo.herenca.Jogador;
import CursoJavaLeonardoLeitao.oo.herenca.Monstro;

public class Jogo {

    public static void main(String[] args) {

        Jogador heroi = new Heroi(10, 10);
        Jogador monstro = new Monstro();

//        heroi.x = 10;
//        heroi.y = 10;

        monstro.x = 10;
        monstro.y = 11;

//        heroi.andar(Direcao.NORTE);
//        heroi.andar(Direcao.LESTE);
//        heroi.andar(Direcao.SUL);
//        heroi.andar(Direcao.NORTE);

        System.out.println("Heroi tem => " + heroi.vida);
        System.out.println("Monstro tem => " + monstro.vida);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        monstro.andar(Direcao.NORTE);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        System.out.println("Heroi tem => " + heroi.vida);
        System.out.println("Monstro tem => " + monstro.vida);

    }

}
