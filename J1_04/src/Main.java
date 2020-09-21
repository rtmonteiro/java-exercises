import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numeros = scanner.nextLine().split(" ");
        int[] vetor = new int[10];
        int x, i = 0;
        for (String numero:numeros) {
            if (i < numeros.length - 1) {
                vetor[i] = Integer.parseInt(numero);
            } else {
                x = Integer.parseInt(numero);
            }
            i++;
        }

        int distanciaPos = 0, distancia = 0;
        for (i = 0; i < vetor.length - 1; i++) {
            int calc = Math.abs(vetor[i] - vetor[i+1]);
            if (distancia < calc) {
                distancia = calc;
                distanciaPos = i;
            }
        }
        System.out.printf("%d %d", distanciaPos, distanciaPos + 1);
    }
}
