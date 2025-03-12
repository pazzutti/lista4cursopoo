package lista.comandofor;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double resultado = 0.0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y != 0) {
                resultado = (double) x / y;
                System.out.printf("%.1f%n", resultado);
            } else {
                System.out.println("divisao impossivel");
            }

        }
        sc.close();
    }
}
