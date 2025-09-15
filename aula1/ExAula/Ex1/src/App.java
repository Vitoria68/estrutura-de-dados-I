import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o n: ");
        int n = sc.nextInt();
        System.out.println(potencia(n));


        sc.close();
    }

    public static long potencia(int n) {
        if ( n == 0)
            return 1;
        return 2*potencia(n-1);
    }
}
