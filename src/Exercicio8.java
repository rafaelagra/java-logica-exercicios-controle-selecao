import java.util.Scanner; //permite leitura de dados do teclado

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //captura a entrada do usuário

        System.out.print("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble(); //lê o valor digitado

        //solicita ao usuário a forma de pagamento
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1- Dinheiro");
        System.out.println("2- Pix");
        System.out.println("3- Cartão de débito");
        System.out.println("4- Cartão de crédito");
        System.out.print("Opção: ");
        int opcao = sc.nextInt(); //lê a opção escolhida

        //inicializei variáveis para desconto e forma de pagamento
        double desconto = 0.0;
        String formaPagamento = "";

        //estrutura switch-case para aplicar regras conforme a opção
        switch (opcao) {
            case 1: //dinheiro
                formaPagamento ="Dinheiro";
                desconto = 0.10; //10% de desconto
                break;
            case 2: //pix
                formaPagamento ="Pix";
                desconto = 0.10; //10% de desconto
                break;
            case 3: //cartão de débito
                formaPagamento = "Cartão de Débito";
                desconto = 0.0; //sem desconto
                break;
            case 4: //cartão de crédito
                formaPagamento ="Cartão de crédito";
                desconto = 0.05; //5% de desconto
                break;
            default: //caso a opção seja inválida, exibe a mensagem e encerra
                System.out.println("opção inválida! Nenhum cálculo realizado.");
                sc.close();
                return; //sai do programa
        }

        double valorFinal = valorCompra - (valorCompra * desconto);

        //exibe os resultados
        System.out.println("\nResumo da compra:");
        System.out.println("Valor original: R$" + valorCompra);
        System.out.println("Forma de pagamento:" + formaPagamento);
        System.out.println("Valor final com desconto: R$" + valorFinal);

        sc.close(); //fecha o scanner
    }
}
