public class ListaCandidato {
    int tamanho = 10;
    int ultimo = 0;

    Candidato[] listaCandidatos;
    private static int proximaInscricao = 1;

    public ListaCandidato(){
        listaCandidatos = new Candidato[tamanho];
    }

    public void adiciona(String nome, double nota) throws Exception {
        if(ultimo == listaCandidatos.length){
            throw new Exception("O vetor esta cheio");
        }

        Candidato novoCandidato = new Candidato(proximaInscricao, nome, nota);  
        proximaInscricao++;      

        listaCandidatos[ultimo] = novoCandidato;
        ultimo++;
    }

    public void consultarNotaPorNome(String nome){
        boolean encontrou = false; 
        for (int i = 0; i < ultimo; i++) {
            if (listaCandidatos[i].getNome().equalsIgnoreCase(nome)) {
                System.out.println(listaCandidatos[i] + "");
                encontrou = true;
            }
        }

        if(!encontrou){
            System.out.println("Nenhum candidato encontrado com esse nome.");
        }
    }

     public void excluirPorInscricao(int inscricao) throws Exception {
        int indiceExcluir = -1;
        for (int i = 0; i < ultimo; i++) {
            if (listaCandidatos[i].getInscricao() == inscricao) {
                indiceExcluir = i;
                break;
            }
        }
        if (indiceExcluir == -1)
            throw new Exception(inscricao + " não encontrada.");

        for (int i = indiceExcluir; i < ultimo - 1; i++) {
            listaCandidatos[i] = listaCandidatos[i + 1];
        }

        ultimo--;

    }

    public void exibirTodos() {
        System.out.println("\n--- Lista de Todos os Candidatos Inscritos ---");
        if (ultimo == 0) {
            System.out.println("Nenhum candidato inscrito no momento.");
        }

        for (int i = 0; i < ultimo; i++) {
            System.out.println(listaCandidatos[i] + "");
        }
    }
}
