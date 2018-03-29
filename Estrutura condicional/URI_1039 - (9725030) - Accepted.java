import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int x[] = new int[6];
        double dinstancia;
        while (leia.hasNext()) {
            for (int i = 0; i < 6; i++) {
                x[i] = leia.nextInt();
            }
            dinstancia = Math.sqrt(Math.pow(x[4] - x[1], 2) + Math.pow(x[5] - x[2], 2));
            if (x[0] >= dinstancia + x[3]) {
                System.out.println("RICO");
            } else {
                System.out.println("MORTO");
            }
        }
    }

}