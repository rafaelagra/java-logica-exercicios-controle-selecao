import java.util.Scanner; //importa a classe scanner para ler dados do teclado

public class Exercicio3 { // classe principal do programa
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); // cria um objeto scanner para capturar a entrada do usuário

        System.out.print("Digite o primeiro número (A): "); // solicita ao usuário o primeiro número
        double A = sc.nextDouble(); // lê o valor digitado e armazena na variável A

        System.out.print("Digite o segundo número (B): "); //solicita ao usuário o segundo número
        double B = sc.nextDouble(); //lê o valor digitado e armazena na variável B

        //estrutura condicional para comparar A e B
        if (A > B) {

            System.out.println("O maior número é A: " + A); //se A for maior que B, mostra a mensagem.
        } else if (B > A) {
            System.out.println("O maior número é B: " + B); // se B for maior que A, mostra a mensagem.
        } else {
            System.out.println("A = B"); // caso contrário, significa que A e B são iguais
        }

        sc.close(); // fecha o scanner
    }
}
