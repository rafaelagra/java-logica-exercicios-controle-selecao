
import java.util.Scanner; // importa a classe Scanner para ler valores do teclado

public class Exercicio1 { // declara a classe principal chamada Exercicio1
    public static void main(String[] args) { // método main: ponto de entrada do programa
        Scanner sc = new Scanner(System.in); // cria um objeto Scanner para capturar entradas do usuário

        // solicita e lê o primeiro número
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        // solicita e lê o segundo número
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        // solicita e lê o terceiro número
        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        // verifica se o primeiro número é maior do que a soma dos outros dois
        if (num1 > (num2 + num3)) {
            System.out.println("O primeiro número é maior que a soma dos outros dois.");
        } else {
            System.out.println("O primeiro número NÃO é maior que a soma dos outros dois.");
        }

        sc.close(); // fecha o Scanner para liberar recursos
    }
}
