import java.util.Scanner;


/*
 Dado a sequência de Fibonacci,
 onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
 escreva um programa na linguagem que desejar onde, informado um número, 
 ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 */

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int f1 = 1;
        int f2 = 0;
        boolean isN = false;

        System.out.print("Informe o número que deseja verificar na sequência: ");
        number = sc.nextInt();

        for(int i = 0; i <= number+1; i++){
            f1 = f1 + f2;
            f2 = f1 - f2;
            if (f2 == number){
                isN = true;
            }
        }

        if(isN){
            System.out.println("O número pertence a sequência!");
        } else {
            System.out.println("O número não pertence a sequência!");
        }

        sc.close();
    }
}
