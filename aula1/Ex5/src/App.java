import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite x: ");
        int x = sc.nextInt();

        System.out.println("Digite y: ");
        int y = sc.nextInt();

        System.out.println("O máximo divisor comum entre eles é " + mdc(x,y));

        sc.close();
    }

    public static long mdc(int x, int y){
        if (x < y) {
            return mdc(y, x);
        } else if(x >= y && x%y == 0){
            return y;
        }
        else{
            return mdc(y, x%y);
        }
    }
}
