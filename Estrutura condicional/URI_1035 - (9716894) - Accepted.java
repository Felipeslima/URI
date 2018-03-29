import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a, b, c, d;
        a = leia.nextInt();
        b = leia.nextInt();
        c = leia.nextInt();
        d = leia.nextInt();
        if (b > c && d > a && (a + b) < (c + d) && c >= 0 && d >= 0 && (a % 2 == 0)) {
            System.out.println("Valores aceitos");
        }else
            System.out.println("Valores nao aceitos");
    }

}
