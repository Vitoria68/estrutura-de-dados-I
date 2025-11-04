public class ListaFilme {
    private int tamanho = 20;
    private Filme[] listaFilmes;
    private int ultimo = 0;//começa vazia

    public ListaFilme(){
        listaFilmes = new Filme[tamanho];
    }

    public void adiciona(Filme filme) throws Exception {
        if (ultimo == listaFilmes.length)
            throw new Exception("O vetor esta cheio");

        int posicao = ultimo;

        if (ultimo == 0) {
            listaFilmes[0] = filme;
        }

        while (posicao > 0 && listaFilmes[posicao-1].getCodigo() > filme.getCodigo()){
            posicao--;
        }

        for (int i = ultimo; i > posicao; --i){
            listaFilmes[i] = listaFilmes[i - 1];
        }

        listaFilmes[posicao] = filme;

        ultimo++;
    }

    public void excluirFilme(Filme f) {
    for (int i = 0; i < ultimo; i++) {
        if (listaFilmes[i] != null && listaFilmes[i].getCodigo() == f.getCodigo()) {
            for (int j = i; j < ultimo - 1; j++) {
                listaFilmes[j] = listaFilmes[j + 1];
            }
            listaFilmes[ultimo - 1] = null; // opcional: limpar última posição
            ultimo--;
            return; // se deseja remover apenas a primeira ocorrência
        }
    }
} 

    public void aumentaTamanho(int numero) {
        Filme[] novoVetor = new Filme[numero];
        for (int i = 0; i < ultimo; i++) {
            novoVetor[i] = listaFilmes[i];
        }
        listaFilmes = novoVetor;

    }

    
    public int getTamanho() {
        return tamanho;
    }

    public int tamanhoDalista() {
        return ultimo;
    }

    public void procuraPeloNome(String nome) {
        for (int i = 0; i < ultimo; i++) {
            if (listaFilmes[i].nome.equals(nome)) {
                System.out.println("Encotramos o filme: " + listaFilmes[i].nome);
                break;
            } else {
                System.out.println("Não encotramos o filme: " + nome);
                break;
            }

        }
    }


}
