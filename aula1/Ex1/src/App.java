import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um numero:");
            int num = sc.nextInt();
            if (num > 0) {
                int resultado = fatorial(num);
                System.out.println("O fatorial de " + num + " é " + resultado);

            } else {
                System.out.println("Digite um numero positivo");

            }
        } catch (Exception ex) {
            System.out.println("Digite um numero");
        }

        try {
            System.out.println("Digite um numero:");
            int x = sc.nextInt();

            System.out.print("A sequencia de " + x + " é: ");
            for (int i = 0; i < x; i++) {
                System.out.print(fibo(i) + ", ");
            }

            sc.close();
        } catch (Exception ex) {
            System.out.println("Caracter invalido");
        }

        sc.close();
    }

    public static int fatorial(int num) throws Exception {
        int res = 1;

        if ((num == 1) || (num == 0)) {
            return num;
        } else {
            for (int i = 1; i <= num; i++) {
                res *= i;
            }
            return res;
        }
    }

    public static long fibo(long x) throws Exception {
        int num1 = 0, num2 = 1, result = 0;
    
        if (x == 0 || x == 1){
            return x;
        }else{
            for (int i = 2; i <= x; i++) {
                result = num1 + num2;
                num1 = num2;
                num2 = result;
            }
            return num2;
        }
    }
}
