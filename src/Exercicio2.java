import java.util.Scanner; // importa a classe scanner para ler dados do teclado

public class Exercicio2 { //declara a classe principal chamada de Exercicio2
    public static void main(String[] args) { //método main: ponto de entrada do programa
        Scanner sc = new Scanner(System.in); // cria objeto scanner para capturar entradas do usuário

        //solicita e lê um número inteiro
        System.out.println("Olá, você está em um programa que classifica se números inteiros são PARES ou ÍMPARES"); // mensagem inicial

        String resposta; // variavel para armazenar a resposta do usuário

        // estrutura de repetição do...while: garante que o código execute pelo menos uma vez
        do {
            //solicita e lê um número inteiro
            System.out.print("Digite um número inteiro: "); // exibe mensagem no console
            int numero = sc.nextInt(); // Lê um número inteiro e armazena na variável 'numero'

            //verifica se o número é Par ou ÍMPAR
            // o operador % retorna o resto da divisão. se for 0 é par.
            if (numero % 2 == 0) {
                System.out.println("O número é PAR!");
            } else {  //caso contrário (resto diferente de zero)
                System.out.println("O número é ÍMPAR!");
            }

            //pergunta se deseja continuar
            System.out.print("Deseja testar outro número? (s/n):");
            resposta = sc.next(); // lê a resposta do usuário (pode ser 's', 'S', 'n' ou 'N')

        } while (resposta.equalsIgnoreCase("s")); //repete se a resposta for 's'

        System.out.println("Programa encerrado. Obrigado por usar!"); // mensagem final
        sc.close(); //fecha o scanner

    }
}