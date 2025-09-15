import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        System.out.println(soma(n));

        sc.close();
    }

    public static long soma(int n) {
         if (n < 10) {
            return n;
        }

        return (n % 10) + soma(n / 10);

    }

}
