/*Faça um programa que preencha um vetor de 100 posições com

números aleatórios de acordo com a seguinte regra: Para cada nú-
mero a ser inserido, sorteie um número aleatório (opção) entre um

e três. Se opção for um, o número deverá ser inserido no início do
vetor. Se opção for dois, o número deverá ser inserido na primeira
posição livre (última posição). Se opção for três, o número deverá

ser inserido imediatamente antes do valor inserido na iteração ante-
rior. Ao final da alocação, exiba o vetor preenchido. */
public class Ex02 {
    static int uPosicao = -1;
    static int posicao = -1;
    public static void main(String[] args) {
        int[] vet = new int[5];
        while (uPosicao < vet.length - 1) {
            int numeroAleatorio = (int) (Math.random() * 3) + 1;
            int numeroAleatorioVetor = (int) (Math.random() * 10) + 1;

            switch (numeroAleatorio) {
                case 1:
                    try {
                        insereNoInicio(vet, numeroAleatorioVetor);
                    } catch (Exception e) {
                        System.out.println("Erro ao inserir no inicio");
                    }
                    break;
                case 2:
                    try {
                        insereNoFinal(vet, numeroAleatorioVetor);

                    } catch (Exception e) {
                        System.out.println("Erro ao inserir no final");
                    }
                    break;
                case 3:
                    try {
                        insereEntreElementos(vet, numeroAleatorioVetor);

                    } catch (Exception e) {
                        System.out.println("Erro ao inserir no meio");

                    }
                    break;
                default:
                    break;
            }

        }
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
    }

    public static void insereNoInicio(int[] vet, int elemento) throws Exception {
        if (uPosicao == vet.length - 1) {
            throw new Exception("Nao ha posicoes livres ");
        }
        for (int i = uPosicao + 1; i > 0; --i)
            vet[i] = vet[i - 1];
        vet[0] = elemento;
        uPosicao++;
        posicao = 0;
        System.out.println(vet[0]+" Inserido no inicio");

    }

    public static void insereNoFinal(int[] vet, int elemento) throws Exception {
        if (uPosicao == vet.length - 1) {
            throw new Exception("Nao ha posicoes livres ");
        }
        vet[++uPosicao] = elemento;
        posicao = uPosicao;
        System.out.println(vet[uPosicao ]+" Inserido no final");

    }

    public static void insereEntreElementos(int[] vet, int elemento) throws Exception {
        if (uPosicao == vet.length - 1)
            throw new Exception("Sem espaco .");
        if (posicao > uPosicao)
            insereNoFinal(vet, elemento);
        if(uPosicao == -1)
            insereNoInicio(vet, elemento);
        else {
            for (int i = uPosicao + 1; i > posicao; --i)
                vet[i] = vet[i - 1];
            vet[posicao] = elemento;
            uPosicao++;
            System.out.println(vet[posicao]+" Inserido no meio");

        }
    }

}
