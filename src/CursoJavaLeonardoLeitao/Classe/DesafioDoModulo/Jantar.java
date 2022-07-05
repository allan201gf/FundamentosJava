package CursoJavaLeonardoLeitao.Classe.DesafioDoModulo;

public class Jantar {

    /*
    Criar 3 classes: pessoa, comida,jantar
    jantar é a classe que executara a ação

    em pessoa vai ter o nome e peso e um metodo comer que recebe um objeto como parametro da classe comida
    com nome e peso da comida

    Acrescentar o peso da comida ao peso da pessoa.
     */

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Allan", 96);

        Comida c1 = new Comida("Laranja", 0.200);
        Comida c2 = new Comida("Frango", 0.400);

        System.out.println(p1.comer(c1));
        System.out.println(p1.comer(c2));

    }
}
