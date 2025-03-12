package lista.comandofor;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0 ; i <= n; i++){
        int a = i * i;
        int b = i * i * i;
        int c = i * i * i * i;
        System.out.println(a + " " + b + " " + c);

        }
        sc.close();
    }
}
