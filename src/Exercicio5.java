import java.util.Scanner; // lê entradas do usuário via teclado

public class Exercicio5 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); //captura os dados digitados pelo usuário

        //solicita ao usuário o primeiro número
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt(); // Lê o valor digitado e armazena na variável num1

        // Solicita ao usuário o segundo número
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt(); // Lê o valor digitado e armazena na variável num2

        // Solicita ao usuário o terceiro número
        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt(); // Lê o valor digitado e armazena na variável num3

        //primeiro passo: comparar num1 e num2
        //se num1 for maior que num2, significa que estão fora de ordem
        if (num1 > num2) {
            int temp = num1; //criei uma variável temporária para armazenar o valor de num1
            num1 = num2; //atribui o valor de num2 para num1
            num2 = temp; //atribui o valor armazenado em temp (que era num1) para num2
            //agora num1 e num2 estão em ordem correta
        }

        //segundo passo: comparar num2 e num3
        //se num2 for maior que num3, também estão fora de ordem
        if (num2 > num3) {
            //fiz a mesma lógica de troca
            int temp = num2;
            num2 = num3;
            num3 = temp;
            //agora num2 e num3 estão na ordem correta
        }

        //terceiro passo: verificar novamente num1 e num2
        //pois a troca anterior pode ter alterado a ordem deles
        if (num1 > num2) {
            //faz a troca novamente se necessário
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("Números em ordem crescente: " + num1 + " , " + num2 + " , " + num3);

        sc.close(); //fecha o scanner

    }
}