public class No {
    No proximo;
    No anterior;
    Cliente elemento;
    public No() {
        this.proximo = null;
        this.anterior = null;
        this.elemento = null;
    }
    public No(Cliente elemento,No proximo, No anterior ) {
        this.proximo = proximo;
        this.anterior = anterior;
        this.elemento = elemento;
    }
    

}
