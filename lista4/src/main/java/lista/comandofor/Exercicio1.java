package lista.comandofor;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <= x && x <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            sc.close();
        }
    }
}