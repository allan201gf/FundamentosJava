package CursoJavaLeonardoLeitao.oo.herenca;

public class Heroi extends Jogador{

    public Heroi(int x, int y) {
        super(x, y);
    }

    /*
    * Podemos inserir o código de atacar novamente e este terá preferencia encima da classe estendida

    boolean atacar(Jogador oponente) {

        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 20;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 20;
        } else {
            return false;
        }
        return true;
    }
     */

    public boolean atacar(Jogador oponente) { // o super reutiliza a classe de herança

        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);

        return ataque1 || ataque2;

    }


}
