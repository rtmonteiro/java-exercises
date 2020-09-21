public class Main {

    public static void main(String[] args) {
        for (int numero = 1001; numero < 9999; numero++){
            int a, b;
            a = numero / 100;
            b = numero - a * 100;
            if ( Math.pow((a + b), 2) == numero )
                System.out.println(numero);
        }
    }
}
