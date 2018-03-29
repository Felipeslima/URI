import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int cod, qntd;
        float preco;
        cod = leia.nextInt();
        qntd = leia.nextInt();
        if (cod == 1) {
            preco = qntd * 4;
        } else if (cod == 2) {
            preco = qntd * 4.5f;
        } else if (cod == 3) {
            preco = qntd * 5;
        } else if (cod == 4) {
            preco = qntd * 2;
        } else {
            preco = qntd * 1.5f;
        }

        System.out.printf("Total: R$ %.2f\n", preco);
    }

}