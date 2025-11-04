public class No {
    No proximo;
    Carro elemento;
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    public Carro getElemento() {
        return elemento;
    }
    public void setElemento(Carro elemento) {
        this.elemento = elemento;
    }
    public No(No proximo, Carro elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }
    public No() {
        this.proximo = null;
        this.elemento = null;
    }
}
