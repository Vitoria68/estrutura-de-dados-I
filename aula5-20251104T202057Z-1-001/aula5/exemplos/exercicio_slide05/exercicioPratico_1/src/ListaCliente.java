public class ListaCliente {
    No cabeca = new No();
    No cauda = cabeca;
    No elemento;

    int tamanho = 0;

    public void add(Cliente c) {
        elemento = new No(c, null, null);
        if (tamanho == 0) {
            cabeca.proximo = elemento;
            cauda = elemento;
        } else {
            No el = cabeca;
            while (el.proximo != null && el.proximo.elemento.getCodigo() < c.getCodigo()) {
                el = el.proximo;
            }
            No el2 = el.proximo;
            elemento.proximo = el2;
            elemento.anterior = el;
            el.proximo = elemento;
            if (el2 != null) {
                el2.anterior = elemento;
            } else {
                cauda = elemento;
            }
        }
        tamanho++;
    }

    public void imprimeCrescente() {
        No el = cabeca.proximo;
        while (el != null) {
            System.out.println("Codigo: " + el.elemento.codigo + "| Nome: " + el.elemento.nome + "| Telefone "
                    + el.elemento.telefone);
            el = el.proximo;
        }
    }

    public void imprimeDecrescente() {
        No el = cauda;
        while (el != cabeca.proximo.anterior) {
            System.out.println("Codigo: " + el.elemento.codigo + "| Nome: " + el.elemento.nome + "| Telefone "
                    + el.elemento.telefone);
            el = el.anterior;
        }
    }

}
