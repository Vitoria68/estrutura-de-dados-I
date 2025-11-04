public class Processo {
    int codigo;
    String responsavel;
    String cliente;
    Processo prox;

    public Processo(int codigo, String responsavel, String cliente) {
        this.codigo = codigo;
        this.responsavel = responsavel;
        this.cliente = cliente;
        this.prox = null;
    }
}