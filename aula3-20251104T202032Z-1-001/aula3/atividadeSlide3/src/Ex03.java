
/*3. Desenvolva uma aplicação (modo texto ou modo gráfico) que permita ao usuário cadastrar até 10 nomes em uma lista de convida-dos (um vetor de String). 
As inclusões devem ser feitas sempre no final do vetor. Crie um pequeno menu para listar e controlar as ações do usuário. 
Seu programa deverá permitir, além da inclusão, exibir a lista de convidados, excluir um convidado específico e visualizar
quantas vagas restam. */
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] vet = new String[10];
        int uPosicao = -1;
        int numeroEscolha = -1;
        int controle = 10;
        while (numeroEscolha != 0) {
            System.out.println("Total de vagas: " + controle);
            System.out.println(
                    "\n 1. Para adicionar nomes \n 2. Para excluir \n 3. Exibir lista \n 0. Sair do programa");
            numeroEscolha = sc.nextInt();
            sc.nextLine();
            switch (numeroEscolha) {
                case 1:
                    try {
                        if (uPosicao < vet.length - 1) {
                            System.out.print("Insira um nome\n");
                            String nomeDigitado = sc.nextLine();
                            uPosicao++;
                            vet[uPosicao] = nomeDigitado;
                            System.out.println("Nome " + nomeDigitado + " adicionado com sucesso.");
                            controle--;
                        } else {
                            System.out.println("Lista está cheia");
                        }
                        break;

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                case 2:
                    try {
                        if (uPosicao == -1)
                            throw new Exception("Vetor vazio");
                        System.out.println("Digite a posição que quer excluir");
                        int posicao = sc.nextInt();
                        if (posicao > uPosicao)
                            throw new Exception("Posição livre");
                        for (int i = posicao; i > uPosicao; i++)
                            vet[i] = vet[i + 1];
                        --uPosicao;
                        controle++;
                        System.out.println("O nome: " + vet[posicao] + "foi excluido");
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                case 3:
                    for (int i = 0; i < vet.length; i++)
                        System.out.println(vet[i] + " ");
                case 0:
                    break;
                default:
                    System.out.println("Escolha uma opção");
                    break;

            }
        }
        sc.close();

    }
}