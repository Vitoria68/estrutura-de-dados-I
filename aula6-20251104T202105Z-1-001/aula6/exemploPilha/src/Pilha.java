public class Pilha {
    static final int MAX_TAM = 100;
    //static final significa q esse valor nunca muda e pertence à classe 
    //indica q a pilha pode armazenar até 100 elementos
    Processo[] pilha = new Processo[MAX_TAM];
    int topo = -1;
    //pq o primeiro elemento eh 0, ent o anterior inexistente eh -1 

    public boolean isVazia() {
        return topo == -1;
    }

    public int getTamanho() {
        return topo + 1;
    }

    public void push(Processo p) throws Exception {
        //push = inserir novo elemento na pilha
        if (topo == MAX_TAM - 1)
        //ver se o topo atingiu o ultimo indice possivel(99), pq o tamanho eh de 100 e o indice começa em 0
            throw new Exception("Não há espaço disponível");
        pilha[++topo] = p;
        //topo = topo +1, é o passo que empilha o objeto
    }

    public Processo pop() throws Exception {
        //pop = remover e retornar o último elemento da pilha
        if (isVazia())
            throw new Exception("Lista vazia");
        return pilha[topo--];
        // Atenção ao operador de pós-decremento
        //ele retorna o topo e, DEPOIS, diminui, removendo o último elemento
    }

}
