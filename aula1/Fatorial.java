import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int n = sc.nextInt();

        System.out.println("O fatorial do número é: ");
        System.out.println(fatorial(n));

        sc.close();
    }

    public static long fatorial(int n) {
        if (n == 0) 
            return 1;
        else 
            return n * fatorial(n - 1);
    }
}
