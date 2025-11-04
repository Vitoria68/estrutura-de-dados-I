public class ListaCarro {
    No cabeca = new No();
    No cauda = cabeca;
    No elemento;
    int tamanho = 0;

    public void add(Carro c) {
        elemento = new No(null, c);
        if (tamanho == 0) {
            cabeca.proximo = elemento;
            cauda = elemento;
        } else {
            elemento.proximo = cabeca.proximo;
            cabeca.proximo = elemento;

        }
        tamanho++;
    }

    public void print() {
        No el = cabeca.proximo;
        while (el != null) {
            System.out.println("Placa: " + el.elemento.placa + "Marca: " + el.elemento.marca + "Modelo: "
                    + el.elemento.modelo + "Valor: " + el.elemento.valor);
            el = el.proximo;
        }
    }

    public void excluir(String placa) {
        No el = cabeca;
        while (el.proximo != null && !el.proximo.elemento.placa.equals(placa)) {
            el = el.proximo;
        }
        if (el.proximo == null) {
            System.out.println("chegou no fim");
            return;
        }

        No noRemove = el.proximo;

        el.proximo = noRemove.proximo;
        if (noRemove.proximo == null)
            cauda = el;
        tamanho--;
    }

}
