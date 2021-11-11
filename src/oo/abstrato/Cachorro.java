package oo.abstrato;

public class Cachorro extends Mamifero {

//    @Override
//    public String mover() { // Não pode ser utilizado pois o metodo mover é do tipo final em Mamifero
//        return "Usando as patas";
//    }

    @Override
    public String mamar() {
        return "Usando leite";
    }
}
