import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        double n = sc.nextInt();
        
        System.out.println("O valor de 2^n é: ");
        System.out.println(elevado(n));

        sc.close();
    }

    public static double elevado(double n) {
        if (n == 0) {
            return 1;
        } else if(n == 1) {
            return 2;
        } else if(n < 0) {
            return 1.0 / (2 * elevado(-n -1));
        }
        else {
            return 2 * elevado(n - 1);
            }
        }
    }

