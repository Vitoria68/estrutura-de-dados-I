import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int vetor[] = new int[5];//mudar pra 100 dps
        int uPosicao = -1;
        Random gerador = new Random();

        //preencher e exibir 
        for (int i= 0; i < vetor.length; i++) {
            int num = (int)(Math.random()*100);
            int opcao = gerador.nextInt(1,3);

            switch (opcao) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }


        }
}

/*2. Faça um programa que preencha um vetor de 100 posições com
números aleatórios de acordo com a seguinte regra: Para cada nú-
mero a ser inserido, sorteie um número aleatório (opção) entre um

e três. Se opção for um, o número deverá ser inserido no início do
vetor. Se opção for dois, o número deverá ser inserido na primeira
posição livre (última posição). Se opção for três, o número deverá

ser inserido imediatamente antes do valor inserido na iteração ante-
rior. Ao final da alocação, exiba o vetor preenchido. */