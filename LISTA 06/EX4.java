import java.util.Scanner;

public class EX4 {

    public static void main(String[] args) {

        int[] num = new int[20];
        int cont = 0, contRep=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Escreva o " +(cont+1)+" numero: ");
            num[cont] = scanner.nextInt();
            cont= cont + 1;
        }while (cont != 20);
        System.out.print("Numeros nao repetidos -> ");
        for (int i = 0; i < num.length; i++) {
            cont = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j]) {
                    cont++;
                }
            }
            if (cont==1){
                System.out.print(+num[i]+" ");
            }
        }
    }
}
