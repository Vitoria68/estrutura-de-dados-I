public class PilhaReferencia {
    int tam = 0;
    Processo topo;
    public boolean isVazia(){
        return tam==0;
    }

    public int getTamanho(){
        return tam;
    }

    public void push(Processo p){
        if (tam!=0)
            p.prox = topo;
        topo = p;
        ++tam;
    }

    public Processo pop() throws Exception{
        if (tam==0)
            throw new Exception ("Pilha vazia");
        Processo p = topo;
        topo= topo.prox;
        --tam;
        return p;
    }
}
