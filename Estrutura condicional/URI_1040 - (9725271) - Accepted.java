import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float n1, n2, n3, n4, n5, media;
        n1 = leia.nextFloat();
        n2 = leia.nextFloat();
        n3 = leia.nextFloat();
        n4 = leia.nextFloat();
        media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10;
        System.out.printf("Media: %.1f\n", media);
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            n5 = leia.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", n5);
            media = (media + n5) / 2;
            if (media >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", media);

        }

    }

}