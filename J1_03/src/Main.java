import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os numeros: ");
        String[] entrada = scanner.nextLine().split(" ");
        int x = Integer.parseInt(entrada[0]);
        int y = Integer.parseInt(entrada[1]);
        System.out.println(mdc(x, y));
    }

    public static int mdc(int x, int y) {
        int a, b, resto;
        a = Math.min(x, y);
        b = Math.max(x, y);
        do {
            resto = a % b;
            a = b;
            b = resto;
        } while (resto != 0);
        return a;
    }
}
