package listas.Conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamentoParametrizado<T> {

    private List<List<T>> tabela = new ArrayList<List<T>>();
    private int tamanho = 0;

    public ConjuntoEspalhamentoParametrizado() {
        for (int i = 0; i < 26; i++) {
            LinkedList<T> lista = new LinkedList<T>();
            tabela.add(lista);
        }
    }

    private int calculaIndiceDaTabela(T objeto) {
        int codigoDeEspalhamento = objeto.hashCode();
        codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
        return codigoDeEspalhamento % tabela.size();
    }

    public void adiciona(T objeto) {
        if (!this.contem(objeto)) {
            this.verificaCarga();
            int indice = this.calculaIndiceDaTabela(objeto);
            List<T> lista = this.tabela.get(indice);
            lista.add(objeto);
            this.tamanho++;
        }
    }

    public void remove(T objeto) {
        if (this.contem(objeto)) {
            int indice = this.calculaIndiceDaTabela(objeto);
            List<T> lista = this.tabela.get(indice);
            lista.remove(objeto);
            this.tamanho--;
            this.verificaCarga();
        }
    }

    public List<T> pegaTodos() {
        List<T> objetos = new ArrayList<T>();
        for (List<T> ts : this.tabela) {
            objetos.addAll(ts);
        }
        return objetos;
    }

    public boolean contem(T objeto) {
        int indice = this.calculaIndiceDaTabela(objeto);
        List<T> lista = this.tabela.get(indice);
        return lista.contains(objeto);
    }

    public int tamanho() {
        return tamanho;
    }

//    private int calculaCodigoDeEspalhamento(String palavra) {
//        int codigo = 1;
//        for (int i = 0; i < palavra.length(); i++) {
//            codigo = 31 * codigo + palavra.charAt(i);
//        }
//        return codigo;
//    }

    public void imprimeTabela() {
        for (List<T> lista : this.tabela) {
            System.out.print("[");
            for (int i = 0; i < lista.size(); i++) {
                System.out.print("*");
            }
            System.out.println("]");
        }
    }

    private void redimensionaTabela(int novaCapacidade) {
        List<T> objetos = this.pegaTodos();
        this.tabela.clear();
        for (int i = 0; i < novaCapacidade; i++) {
            this.tabela.add(new LinkedList<T>());
        }
        for (T objeto : objetos) {
            this.adiciona(objeto);
        }
    }

    private void verificaCarga() {
        int capacidade = this.tabela.size();
        double carga = (double) this.tamanho / capacidade;
        if (carga > 0.75) {
            this.redimensionaTabela(capacidade * 2);
        } else if (carga < 0.25) {
            this.redimensionaTabela(Math.max(capacidade / 2, 10));
        }
    }
}



