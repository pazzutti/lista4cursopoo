package lista.comandofor;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fat = 1;
        for (int i = 1; i <= n; i++){
            fat = fat * i;
        }
        sc.close();
        System.out.println(fat);
    }
}
