import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {
        int[] num = new int[10];
        int cont = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° numero: ");
            num[i] = (scanner.nextInt());
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j] && i != j) {
                    System.out.println(num[i]);

                }
            }
        }
    }
}