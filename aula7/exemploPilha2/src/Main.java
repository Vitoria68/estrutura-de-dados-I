public class Main {
    public static void main(String[] args) throws Exception {
        PilhaReferencia pilha = new PilhaReferencia();
        Processo proc;
        pilha.push(new Processo(1, "Rosimeire", "Acme"));
        pilha.push(new Processo(2, "Afonso", "Samsung"));
        pilha.push(new Processo(3, "Rosimeire", "Lenovo"));
        pilha.push(new Processo(4, "Ana", "Lenovo"));
        pilha.push(new Processo(5, "Afonso", "Acme"));
        pilha.push(new Processo(6, "Rosimeire", "Samsung"));

        System.out.println("Lista de processos a serem executados");
        while (!pilha.isVazia()){
            proc = pilha.pop();
            System.out.printf("Código: %d\t\tResponsável: %s\t\tCliente: %s\n", proc.codigo, proc.responsavel, proc.cliente);

        }
    }
}
