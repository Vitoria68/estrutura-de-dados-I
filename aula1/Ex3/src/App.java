import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

         if(primo(n)){
                System.out.println(n + " é primo");
            }
            else{
                System.out.println(n + " não é primo");
            }

        sc.close();
    }

    public static boolean primo(int n) throws Exception{
        return primo(n, 2);
    }


    public static boolean primo(int n, int div) {
        if (n < 2) {
            return false;
        }
        if(n % div == 0){
            return false;
        }
        if(div * div > n){
            return true;
        }
        return primo(n, div + 1); 
    }
}
