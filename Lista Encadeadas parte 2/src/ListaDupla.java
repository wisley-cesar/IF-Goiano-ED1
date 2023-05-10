public class ListaDupla {
    Celula Primeira;
    Celula Ultima;
    int TotaldeElementos = 0;

    boolean PosicaoOcupada(int pos) {
        return ((pos >= 0) && (pos < this.TotaldeElementos));

    }

    Celula PegaCelula(int pos) {
        if (!this.PosicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posicao nao existe");

        } else {
            Celula atual = this.Primeira;
            for (int i = 0; i < pos; i++) {
                atual = atual.getProxima();

            }
            return (atual);
        }
    }

    Object Pega(int pos) {
        return (this.PegaCelula(pos).getElemento());
    }

    public void AdicionarNoComeco(Object elemento) {
        if (this.TotaldeElementos == 0) {
            Celula nova = new Celula(elemento);
            this.Primeira = nova;
            this.Ultima = nova;
        } else {
            Celula nova = new Celula(this.Primeira, elemento);
            this.Primeira.setAnterior(nova);
            this.Primeira = nova;
        }
        this.TotaldeElementos++;
    }

    public void Adiciona(Object elemento) {
        if (this.TotaldeElementos == 0) {
            this.AdicionarNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            nova.setAnterior(this.Ultima);
            this.Ultima = nova;
            this.TotaldeElementos++;
        }
    }

    public void Adicionar(int pos, Object elemenento) {
        if (pos == 0) {
            this.AdicionarNoComeco(elemenento);
        } else if (pos == this.TotaldeElementos) {
            this.Adiciona(elemenento);
        } else {
            Celula anterior = this.PegaCelula(pos - 1);
            Celula proxima = anterior.getProxima();
            Celula nova = new Celula(anterior.getProxima(), elemenento);
            nova.setAnterior(anterior);
            anterior.setProxima(nova);
            proxima.setAnterior(nova);
            this.TotaldeElementos++;

        }
    }

    public void RemovedoComeco() {
        if (!this.PosicaoOcupada(0)) {
            throw new IllegalArgumentException("Posicao nao Existe");
        } else {
            this.Primeira = this.Primeira.getProxima();
            this.TotaldeElementos--;
        }
        if (this.TotaldeElementos == 0) {
            this.Ultima = null;
        }
    }

    public void RemovedoFim() {
        if (!this.PosicaoOcupada(TotaldeElementos - 1)) {
            throw new IllegalArgumentException("Posicao nao existe");
        } else {
            if (this.TotaldeElementos == 1) {
                this.RemovedoComeco();
            } else {
                Celula penultima = this.Ultima.getAnterior();
                penultima.setProxima(null);
                this.Ultima = penultima;
                this.TotaldeElementos--;
            }
        }
    }

    public void Remove(int pos) {
        if (!this.PosicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posicao nao Existe");
        } else if (pos == 0) {
            this.RemovedoComeco();
        } else if (pos == this.TotaldeElementos - 1) {
            this.RemovedoFim();
        } else {
            Celula anterior = this.PegaCelula(pos - 1);
            Celula atual = anterior.getProxima();
            Celula proxima = atual.getProxima();
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
            this.TotaldeElementos--;
        }
    }

    public boolean Contem(Object elemento) {
        Celula atual = this.Primeira;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return (true);
            }
            atual = atual.getProxima();
        }
        return (false);
    }

    public int Tamanho() {
        return (this.TotaldeElementos);

    }

    public void EsvaziaLista() {
        this.Primeira = null;
        this.Ultima = null;
        this.TotaldeElementos = 0;
    }

    public String Imprimir() {
        if (this.TotaldeElementos == 0) {
            return ("[]");
        } else {
            StringBuilder builder = new StringBuilder("[");
            Celula atual = this.Primeira;
            for (int i = 0; i < this.TotaldeElementos - 1; i++) {
                builder.append(atual.getElemento());
                builder.append(", ");
                atual = atual.getProxima();
            }
            builder.append(atual.getElemento());
            builder.append("]");
            return (builder.toString());
        }
    }
}