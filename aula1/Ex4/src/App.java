import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique um número: ");
        int n = sc.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = sc.nextInt();

        System.out.print(" A multiplicação do primeiro pelo segundo é: ");
        System.out.print(multi(n, n2));

        sc.close();
    }

    public static long multi(int n, int n2) {
        if (n2  == 0){
            return 0;
        } else {
            return n + multi(n, n2-1);
        }
    } 
}
