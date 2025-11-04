public class Main {
    public static void main(String[] args) throws Exception {
        Pilha p = new Pilha();//p eh instância do objeto pilha
        Processo proc = new Processo(); //vai ser usado para receber os processos desempilhados (desempilhafos == removidos)

        //abaixo é a criação de objetos
        p.push(new Processo(1, "Rosimeire", "Acme"));
        p.push(new Processo(2, "Afonso" ,"Sansung"));
        p.push(new Processo(3, "Rosimeire", "Lenovo"));
        p.push(new Processo(4, "Ana" ,"Lenovo"));
        p.push(new Processo(5, "Afonso" ,"Acme"));
        p.push(new Processo(6, "Rosimeire", "Lenovo"));

        System.out.println("Lista de processos a serem executados:");
        while (!p.isVazia()){
            proc = p.pop();
            //remove/desempilha o último processo inserido na pilha e armazena em proc 
            System.out.printf("Responsável: %s\t\t Código %d\tCliente: %s\n", proc.responsavel, proc.codigo, proc.cliente);
            //%s\t\t = string + tecla tab + tecla tab -> alinhar dados na tela ao permitir mais espaço

            //%d\t = int + tecla tab

            //%s\n = string + quebra de linha
        }

    }
}
