
public class App {
    public static void main(String[] args) throws Exception {
        int vetor[] = new int[10];
        int uPosicao = -1;// Inicializando uPosicao como -1, pois o vetor começa vazio

        //exibir valor preenchido
        System.out.print("O vetor preenchido é: ");
        for (int i = 0; i < vetor.length; i++) {
            int num = (int) (Math.random() * 100);
            vetor[i] = num;
            uPosicao++;// Atualiza uPosicao para refletir o número de elementos
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\nO vetor sem números pares é: ");
        //tirar pares
        //tentando com while
        int i = 0;
        while(i <= uPosicao) {
            if (vetor[i] % 2 == 0) {
                for (int j = i; j < uPosicao; j++ ) {
                    vetor[j] = vetor[j + 1]; // n pode ser vetor [j] = vetor[j+1] pq perde valores validos e causa sobrescrita de dados importantes, caso fosse i+1. mas agora coloquei só i, ent pode ser desse jeito
                }
                uPosicao--;
            } else {
                i++;
            }
        }

        //mostrar vetor
        for(int l = 0; l <= uPosicao; l++){
            System.out.print( vetor[l] + " ");
        }
    }
}
/*1. Faça um programa que preencha um vetor de 10 posições com
números aleatórios. Exiba o vetor preenchido. Remova do vetor
todos os números pares e exiba seu conteúdo novamente. */