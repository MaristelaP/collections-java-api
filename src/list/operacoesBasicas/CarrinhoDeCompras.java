package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    //atributos
    private List<Item> itens;

    //construtor
    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    //metodos
    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        itens.add(item);
    }

    public void removerItem(String nome) {
        Item apagarItem = null;
        for (Item item : itens) {
            if (item.getNome().equals(nome)) {
                apagarItem = item;
                break;
            }
        }
        if (apagarItem != null) {
            itens.remove(apagarItem);
        }
    }


    public double calcularValorTotal(double preco, int quantidade) {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        for (Item item : itens) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itens +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("caneta", 2.00, 1);
        carrinhoDeCompras.adicionarItem("caderno", 9.00, 1);
        carrinhoDeCompras.adicionarItem("lapis", 1.00, 3);

        System.out.println("Itens no carrinho: ");
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("caneta");
        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal(1.0,3));

    }
}
