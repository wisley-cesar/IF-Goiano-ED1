public class Celula {
    Celula Proxima;
    Celula Anterior;
    Object Elemento;

    public Celula(Celula proxima, Object elemento) {
        this.Proxima = proxima;
        this.Anterior = null;
        this.Elemento = elemento;
    }

    public Celula(Object elemento) {
        this.Elemento = elemento;
        this.Anterior = null;
        this.Proxima = null;

    }
    void setProxima(Celula proxima){
        this.Proxima = proxima;

    }
    void setAnterior(Celula anterior){
        this.Anterior = anterior;

    }

    public Celula getProxima() {
        return (this.Proxima);
    }

    public Celula getAnterior() {
        return (this.Anterior);
    }

    public Object getElemento() {
        return (this.Elemento);
    }

    public void setElemento(Object elemento) {
        Elemento = elemento;
    }
}
