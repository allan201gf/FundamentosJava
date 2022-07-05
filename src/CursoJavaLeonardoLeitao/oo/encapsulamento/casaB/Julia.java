package CursoJavaLeonardoLeitao.oo.encapsulamento.casaB;

import CursoJavaLeonardoLeitao.oo.encapsulamento.casaA.Ana;

public class Julia {

    void testeAcessos() {

        Ana sogra = new Ana();

        // segredo
        // facoDentroDeCasa
        // formaDeFalar
        // todosSabem

        // System.out.println(esposa.segredo); // erro pois é algo privado
//        System.out.println(sogra.facoDentroDeCasa);
//        System.out.println(sogra.formaDeFalar);
        System.out.println(sogra.todosSabem); // unico que é possivel acessar, o public


    }
}
