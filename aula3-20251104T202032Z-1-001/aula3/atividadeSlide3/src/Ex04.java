/*4. Desenvolva uma aplicação que permita ao usuário cadastrar até 10
números inteiros. Desenvolva opções para que sejam feitas inclusões
e exclusões em todas as posições possíveis. Para inserções e exclusões
no meio, apresente ao usuário o intervalo de escolha possível. */
public class Ex04 {
    static int uPosicao = -1;

    public static void main(String[] args) {
        int[] vet = new int[10];
        try {
            adicionaNoInicio(vet, 0);
            imprimirVetor(vet, uPosicao);
            adicionaNoInicio(vet, 1);
            imprimirVetor(vet, uPosicao);
            adicionaNoFinal(vet, 5);
            imprimirVetor(vet, uPosicao);
            adicionaNoFinal(vet, 7);
            imprimirVetor(vet, uPosicao);
            adicionaElemento(vet, 8, 0);
            imprimirVetor(vet, uPosicao);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void excluirNoInicio(int[] vet) throws Exception {
        if (uPosicao == -1)
            throw new Exception("Vetor vazio");
        for (int i = 1; i <= uPosicao; ++i)
            vet[i - 1] = vet[i];
        --uPosicao;

    }

    public static void excluirNoFinal(int[] vet) throws Exception {
        if (uPosicao == -1)
            throw new Exception("Vetor vazio");
        --uPosicao;

    }

    public static void excluirElemento(int[] vet, int p) throws Exception {
        if (uPosicao == -1)
            throw new Exception("Vetor vazio");
        if (p > uPosicao)
            throw new Exception("Casa esta livre, não tem o que excluir");
        for (int i = p; i < uPosicao; ++i)
            vet[i] = vet[i + 1];
        --uPosicao;

    }

    public static void adicionaNoInicio(int[] vet, int elemento) throws Exception {
        if (uPosicao == vet.length - 1)
            throw new Exception("Vetor ta cheio");
        for (int i = uPosicao + 1; i > 0; --i)
            vet[i] = vet[i - 1];
        vet[0] = elemento;
        uPosicao++;
    }

    public static void adicionaNoFinal(int[] vet, int elemento) throws Exception {
        if (uPosicao == vet.length - 1)
            throw new Exception("Vetor ta cheio");
        uPosicao++;
        vet[uPosicao] = elemento;
    }

    public static void adicionaElemento(int[] vet, int elemento, int p) throws Exception {
        if (uPosicao == vet.length - 1)
            throw new Exception("Vetor ta cheio");
        if (p > uPosicao)
            adicionaNoFinal(vet, elemento);
        for (int i = uPosicao + 1; i > p; --i)
            vet[i] = vet[i - 1];
        vet[p] = elemento;
        uPosicao++;
    }

    public static void imprimirVetor(int[] vet, int uPosicao) {
        System.out.print("Estado atual do vetor: [");

        // Se o vetor está vazio, apenas imprime "vazio"
        if (uPosicao == -1) {
            System.out.println("] (vazio)");
            return; // Encerra o método aqui
        }

        // Laço que vai apenas até o último elemento inserido
        for (int i = 0; i <= uPosicao; i++) {
            System.out.print(vet[i]);
            // Adiciona uma vírgula se não for o último elemento
            if (i < uPosicao) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
