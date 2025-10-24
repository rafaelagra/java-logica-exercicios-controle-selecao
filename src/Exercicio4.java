import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); // lê os dados do teclado

        //solicita ao usuário 3 números
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble(); // lê o primeiro número

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble(); // lê o segundo número

        System.out.print("Digite o terceiro número: ");
        double num3 = sc.nextDouble(); // lê o terceiro número

        //inicializa a variável maior com o primeiro número
        double maior = num1;

        //compara o segundo número com o maior atual
        if (num2 > maior) {
            maior = num2; // atualiza se num2 for maior
        }
        //compara o terceiro número com o maior atual
        if (num3 > maior) {
            maior = num3; //atualiza se num3 for maior
        }
        //exibe o maior número encontrado
        System.out.println("O maior número é: " + maior);

        sc.close();//fecha o scanner
    }
}