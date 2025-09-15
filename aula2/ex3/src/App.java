
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7};

        System.out.println("Digite o número que você está procurando: ");
        int val = sc.nextInt();
        int ini = 0;
        int fim = 7;

        if (bb(val, a, ini, fim) == true) {
            System.out.println("O número existe no vetor.");
        } else {
            System.out.println("O número não existe no vetor.");
        }

        sc.close();
    }

    public static boolean bb(int val, int[] a, int ini, int fim) {
        int meio = (ini + fim)/2;
        if (a[meio] == val){
            return true;
        } else {
            if (ini >= fim) {
                return false;
            } else {
                if(a[meio] < val){
                    ini = meio + 1;
                } else {
                    fim = meio - 1;
                }
                return bb(val, a, ini, fim);
            }
        }
    }
}


/*Escreva um método, considerando um vetor ordenado de forma
não decrescente, que diga se um determinado número existe ou não
neste vetor. Este algoritmo deve possuir complexidade assintótica
limitada por O(logn) */