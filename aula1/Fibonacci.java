import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int n = sc.nextInt();

        System.out.println("O fibonacci do número é: ");
        System.out.println(fibo(n));


        sc.close();
    }

    public static long fibo(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
}
    