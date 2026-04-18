package atividadePratica;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float n1, n2, n3, n4, media;

        System.out.print("Nota 1: ");
        n1 = sc.nextFloat();

        System.out.print("Nota 2: ");
        n2 = sc.nextFloat();

        System.out.print("Nota 3: ");
        n3 = sc.nextFloat();

        System.out.print("Nota 4: ");
        n4 = sc.nextFloat();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("\nMédia final: " + media);

        sc.close();
    }
}