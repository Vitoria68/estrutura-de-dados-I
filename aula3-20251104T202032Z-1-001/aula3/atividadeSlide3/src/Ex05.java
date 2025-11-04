/*5. Escreva um método que imprima, em ordem crescente, todos os
elementos de um vetor de inteiros. O método não pode ordenar o
vetor e, obviamente, o vetor não está ordenado. */
public class Ex05 {
    public static void main(String[] args) {
        int[] vet = { 5, 2, 51, 0, 4, 7, 6, 21, 3 };
        int menorNum = Integer.MIN_VALUE;
        for (int i = 0; i < vet.length; i++) {
            int proximoMenorNum = Integer.MAX_VALUE;
            for (int j = 0; j < vet.length; j++) {
                if (vet[j] > menorNum && proximoMenorNum > vet[j]) {
                    proximoMenorNum = vet[j];
                }

            }
            System.out.println(proximoMenorNum);
            menorNum  = proximoMenorNum;
        }
    }

}
