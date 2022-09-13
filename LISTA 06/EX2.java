import java.util.Arrays;
import java.util.Scanner;

public class EX2 {
    // Faça um programa para ler 5 valores e, em seguida, mostrar todos os valores lidos juntamente
    // com o maior, o menor e a média dos valores.

    public static void main(String[] args) {
        int[] num = new int[5];
        int soma=0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o "+ (i+1) + "° numero: ");
            num[i] = (scanner.nextInt());
            soma = soma +num[i];
        }
        for (int j = 0; j < num.length; j++){
            System.out.println(num[j]+ "  ");
        }
        Arrays.sort(num);
            System.out.println("menor "+num[0]);
        System.out.println("maior "+num[4]);
        System.out.println("media: "+(soma/5));
    }
}

