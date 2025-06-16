package projetos.caixaDeSuperMercado;
import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        CupomFiscal cupom = new CupomFiscal();

        System.out.println("=== SISTEMA DE VENDA ===");

        while(true){
            System.out.println("Nome do produto: ");
            String nome = scan.nextLine();

            System.out.print("Quantidade: ");
            int quantidade = Integer.parseInt(scan.nextLine());

            System.out.print("Preço unitário: ");
            double precoUnitario = Double.parseDouble(scan.nextLine());

            Produto produto = new Produto(nome, precoUnitario, quantidade);
            cupom.adicionarProduto(produto);

            System.out.print("Deseja adicionar outro produto? (s/n): ");
            String continuar = scan.nextLine();
            if (continuar.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Informe o código do cupom de desconto (DESC10, DESC20 ou nenhum):");
        String codigo = scan.nextLine();
    }
}
