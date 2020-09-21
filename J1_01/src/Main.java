import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        double numerador;
        double denominador;
        int qtd = 50;
        double soma = 0;

        for (int i = 0; i < qtd; i++) {
            numerador   = 1 + (2 * i);
            denominador = 1 + (    i);
            soma += numerador / denominador;
        }
        System.out.println("S1 = " + soma);

        soma = 0;
        for (int i = 0; i < qtd; i++) {
            numerador = Math.pow(2, i + 1);
            denominador = qtd - i;
            soma += numerador / denominador;
        }
        System.out.println("S2 = " + soma);

        qtd = 10;
        soma = 0;
        for (int i = 0; i < qtd; i++) {
            numerador = i +  1;
            denominador = Math.pow(i + 1, 2);
            soma = soma + (Math.pow(-1, i) * (numerador / denominador));
        }
        System.out.println("S3 = " + soma);
    }
}