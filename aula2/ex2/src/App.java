public class App {

    /*não terminei, fazer dps */
    public static void main(String[] args) throws Exception {
        int[] vet = {1, 2, 3, 4, 5};
        int menos = vet[0];
        int meio = vet[0];
        int mais = vet[0];

        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > mais) {
                mais = vet[i];
            }
        }

        for (int j = 1; j < vet.length; j++) {
            if (vet[j] > meio && vet[j] != mais) {
                meio = vet[j];
            }
        }

        for (int k = 1; k < vet.length; k++) {
            if (vet[k] > menos && vet[k] != mais && vet[k] != meio) {
                menos = vet[k];
            }
        }

        System.out.println("Os três maiores números, em ordem crescente, são: " +
        menos + ", " + meio + ", " + mais + ".");

        }

    }



/* Escreva um algoritmo que retorne os 3 maiores números entre
os elementos de um vetor com n posições. Qual a complexidade
assintótica do algoritmo que você desenvolveu?*/
//linear, 0(n)

//retornar  o vetor sem o maior numero?