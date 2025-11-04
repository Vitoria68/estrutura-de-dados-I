/*6. Escreva um método que receba como parâmetro dois vetores de
inteiros (de tamanho n) e retorne um vetor de inteiro (de mesmo
tamanho) preenchido de acordo com a seguinte regra: Para cada
posição do terceiro vetor, sorteie um número aleatório. Caso este
número seja par, receba um elemento do primeiro vetor, caso ímpar,
do segundo vetor. Os valores dos dois primeiros vetores devem ser
acessados na ordem em que foram enviados. */


import java.util.Arrays;

public class Ex06 {
    static int uPosicao = -1;

    public static void main(String[] args) {
        int[] vet1 = { 1, 2, 3 };
        int[] vet2 = { 4, 5, 6 };

        System.out.println(Arrays.toString(retornaVetor(vet1, vet2)));
    }

    public static int[] retornaVetor(int[] vet1, int[] vet2) {
        int[] vet3 = new int[vet1.length];
        int contador1 = 0;
        int contador2 = 0;

        while (uPosicao < vet3.length -1) {
            int random = (int) (Math.random() * 2) + 1;
            if (random % 2 == 0) {
                try {
                    adicionaFinal(vet3, vet1[contador1]);
                    contador1++;
                    System.out.println("Numero do vetor 1 adicionado");
                } catch (Exception e) {
                    System.out.println("Erro ao colocar numero do vetor 1");
                }
               
            } else {
                try {
                    adicionaFinal(vet3, vet2[contador2]);
                    contador2++;
                    System.out.println("Numero do vetor 2 adicionado");
                } catch (Exception e) {
                    System.out.println("Erro ao colocar numero do vetor 2");
                }
               

            }

        }
        return vet3;
    }

    public static void adicionaFinal(int[] vet, int elemento) throws Exception {
        if (uPosicao == vet.length - 1)
            throw new Exception("O vetor está cheio");
        uPosicao++;
        vet[uPosicao] = elemento;
    }
}
