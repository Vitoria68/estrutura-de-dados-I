public class App {
    public static void main(String[] args) throws Exception {
        ListaFilme lista = new ListaFilme();
        Filme filme1 = new Filme("1", "Terror", 0);
        Filme filme2 = new Filme(" 10", "Terror", 10);
        Filme filme3 = new Filme(" 2", "Terror", 1);
        
        lista.aumentaTamanho(6);
        lista.adiciona(filme1);
        lista.adiciona(filme3);
        lista.adiciona(filme2);
        lista.adiciona(new Filme(" 87", "Terror", 1));
        lista.procuraPeloNome("resenha");
    }
}




/*Desenvolva uma lista de Filmes (codigo, nome e genero). O
método de inserção deverá adicionar itens na lista mantendo-se
a ordenação pelo código (considere que a lista estará ordenada
inicialmente ou vazia).*/

