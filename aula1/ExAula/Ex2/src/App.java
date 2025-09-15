import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite n: ");
        int n = sc.nextInt();
        System.out.println(primo(n));

        sc.close();
    }

    public static boolean primo(int n) {
        return primo(n, n-1);
    }

    public static boolean primo(int n, int i){
        if (n == 2) 
           return true;
        if (n == 1)
            return false;
        if (i ==1)
            return true;
        if (n%i==0)
            return false;
        else
            return primo(n, i-1);

    }
}
