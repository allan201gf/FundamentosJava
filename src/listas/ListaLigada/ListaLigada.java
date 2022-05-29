package listas.ListaLigada;

public class ListaLigada {

    private Celula primeira;
    private Celula ultima;
    private Integer totalDeElementos = 0;

    public void adiciona(Object elemento) {
        if (totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            ultima.setProxima(nova);
            nova.setAnterior(ultima);
            ultima = nova;
            totalDeElementos++;
        }
    }

    public void adiciona(int posicao, Object elemento) {
        if (posicao == 0) { // No começo.
            adicionaNoComeco(elemento);
        } else if (posicao == this.totalDeElementos) { // No fim.
            adiciona(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula proxima = anterior.getProxima();
            Celula nova = new Celula(anterior.getProxima(), elemento);
            nova.setAnterior(anterior);
            anterior.setProxima(nova);
            proxima.setAnterior(nova);
            totalDeElementos++;
        }
    }

    public Object pega(int posicao) {
        return pegaCelula(posicao).getElemento();
    }

    public void remove(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        if (posicao == 0) {
            removeDoComeco();
        } else if (posicao == totalDeElementos - 1) {
            removeDoFim();
        } else {
            var anterior = pegaCelula(posicao - 1);
            var atual = anterior.getProxima();
            var proxima = atual.getProxima();

            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);

            totalDeElementos--;
        }
    }

    public int tamanho() {
        return totalDeElementos;
    }

    public boolean contem(Object elemento) {
        var atual = primeira;

        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return true;
            }
            atual = atual.getProxima();
        }
        return false;
    }

    public void adicionaNoComeco(Object elemento) {
        if (totalDeElementos == 0) {
            Celula nova = new Celula(elemento);
            primeira = nova;
            ultima = nova;
        } else {
            Celula nova = new Celula(this.primeira, elemento);
            primeira.setAnterior(nova);
            primeira = nova;
        }
        totalDeElementos++;
    }

    public void removeDoComeco() {
        if (!posicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        primeira = primeira.getProxima();
        totalDeElementos--;
        if (totalDeElementos == 0) {
            ultima = null;
        }
    }

    public void removeDoFim() {
        if (!posicaoOcupada(totalDeElementos - 1)) {
            removeDoComeco();
        } else {
            var penultima = ultima.getAnterior();
            penultima.setProxima(null);
            ultima = penultima;
            totalDeElementos--;
        }
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeElementos;
    }

    private Celula pegaCelula(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        var atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }
        return atual;
    }

    @Override
    public String toString() {
        if (totalDeElementos == 0) {
            return "[]";
        }

        var atual = primeira;

        StringBuilder elementos = new StringBuilder("[");

        for (int i = 0; i < totalDeElementos - 1; i++) {
            elementos.append(atual.getElemento());
            atual = atual.getProxima();
            elementos.append(", ");
        }
        elementos.append(atual.getElemento());

        elementos.append("]");
        return elementos.toString();
    }
}
