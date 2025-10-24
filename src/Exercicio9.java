import java.util.Scanner; //permite a leitura de dados no teclado

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //captura a entrada do usuário

        System.out.print("Digite o preço do litro do álcool: ");
        Double precoAlcool = sc.nextDouble(); //lê o preço do álcool

        System.out.print("Digite o preço do litro da gasolina: ");
        double precoGasolina = sc.nextDouble(); //lê o preço da gasolina

        //calcula a diferença percentual entre os preços
        double diferencaPercentual = ((precoGasolina - precoAlcool) / precoGasolina) * 100;

        System.out.println("\nDiferença percentual entre gasolina e álcool: " + diferencaPercentual + "%");

        //agora verifiquei qual combust´vel é mais vantajoso
        //regra: álcool é vantajoso se precoAlcool <=70% dp precoGasolina
        if (precoAlcool <= (precoGasolina * 0.70)) {
            System.out.println("É mais vantajoso abasteceer com Álcool.");
        } else {
            System.out.println("É mais vantajoso abastecer com Gasolina.");
        }

        sc.close(); //fecha o scanner
    }
}