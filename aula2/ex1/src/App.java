public class App {
    public static void main(String[] args) throws Exception {
        int[] vet = {1, 2, 3, 4, 5};
        int maior = vet[0];
        int menor = vet[0];

        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }

            if (vet[i] < menor) {
                menor = vet[i];
            }
        }

        System.out.println("O maior número é " + maior + " e o menor é " + menor + ".");
    }
}

//a complexidade assintótica do algoritmo que você desenvolveu: linear, 0(n).
