import java.util.Scanner;

public class EX6 {

    public static void main(String[] args) {
        int num[] = new int[10];
        int x, i = 0;
        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < num.length; i++) {
            System.out.print("insira o " + (i + 1) + " numero: ");
            num[i] = scanner.nextInt();
        }
        System.out.print("informe o valor de X: ");
        x = scanner.nextInt();
        for (i = 0; i < num.length; i++) {
            System.out.println(x + " x " + num[i] + " = " + (num[i] * x));
        }
    }
}