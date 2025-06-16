package projetos.caixaDeSuperMercado;

import projetos.reservaDeHospedagem.model.Cliente;

import java.util.ArrayList;

public class CupomFiscal {
    //private ArrayList<Cliente> clientes;
    private ArrayList<Produto> produtos;
    private double desconto;

    public CupomFiscal() {
        this.produtos = new ArrayList<>();
        this.desconto = desconto;
    }

    public void adicionarProduto(Produto p){
        produtos.add(p);
    }

    public void aplicarCupom(String codigo){
        switch(codigo.toUpperCase()){
            case "SEMDES":
                desconto = 0.0;
                break;
            case "DES10":
                desconto = 0.10;
                break;
            case "DESCO15":
                desconto = 0.15;
                break;
        }
    }

    public void imprimirCupom() {
        double total = 0.0;
        System.out.println("-------- CUPOM FISCAL --------");
        for (Produto p : produtos) {
            double subtotal = p.getSubTotal();
            total += subtotal;
            System.out.println(String.format("%s x%d - R$ %.2f", p.getNome(), p.getQuantidade(), subtotal));
        }

        System.out.println("");

    }
}

   /*
Gerencia a lista de produtos, calcula totais e imprime o cupom com desconto.
Atributos:

Uma lista de objetos da classe Produto.
Porcentagem de desconto aplicada com base em um cupom promocional.
Responsabilidades:
Receber os produtos comprados.
Aplicar um desconto com base em códigos promocionais (via switch).
Calcular o total bruto e o total com desconto.
Imprimir o cupom fiscal formatado com todos os dados (nome, quantidade, subtotal de cada produto e total final).

  */
