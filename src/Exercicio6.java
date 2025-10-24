import java.util.Scanner; //permite a leitura de dados do teclado

public class Exercicio6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); //cria um objeto para capturar entrada do usuário

        System.out.print("Digite a velocidade do veículo (em Km/h): ");
        double velocidade = sc.nextDouble(); //lê a velocidade digitada

        double velocidadePermitida = 80.0; //define a velocidade permitida (fixa em 80 km/h)
        double excesso = velocidade - velocidadePermitida; //calcula o quanto a velocidade ultrapassou o limite

        //verifica se houve excesso de velocidade
        if (excesso > 0) { //se excesso > 0, significa que o motorista está acima do limite
            double multa = 0; //inicializa a variável multa

            //apliquei as regras para determinar o valor da multa
            //a) R$200 se ultrapassar em até 10 km/h
            if (excesso <= 10) {
                multa = 200.0;
            }
            //b) R$300 se ultrapassar entre 10 e 30 km/h
            else if (excesso <= 30) {
                multa = 300.0;
            }
            //c) R$500 se ultrapassar mais de 30 km/h
            else {
                multa = 500.0;
            }
            //exibe o valor da multa para o usuário
            System.out.println("Voce ultrapassou o limite de velocidade!");
            System.out.println("Valor da multa: R$" + multa);
        } else {
            System.out.println("Velocidade dentro do limite. Nenhuma multa aplicada."); //se não houver excesso, não há multa
        }
        sc.close(); //fecha o scanner
    }
}