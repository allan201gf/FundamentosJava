package CursoJavaLeonardoLeitao.oo.encapsulamento.casaB;

import CursoJavaLeonardoLeitao.oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {

//        Ana mae = new Ana();

        // segredo
        // facoDentroDeCasa
        // formaDeFalar
        // todosSabem

        // System.out.println(esposa.segredo); // erro pois é algo privado
        //System.out.println(mae.facoDentroDeCasa); //Visivel apenas dentro do pacote
        System.out.println(formaDeFalar); //recebe por herança, nao precisa instanciar
        System.out.println(todosSabem); //recebe por herança, nao precisa instanciar


    }

}
