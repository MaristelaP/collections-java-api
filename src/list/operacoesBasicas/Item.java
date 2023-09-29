package list.operacoesBasicas;

public class Item {
    //atributo
    private String nome;
    private double preco;
    private int quantidade;

    //construtor

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //metodo get

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


    //to string para retornar o valor do itemAdquirido

    @Override
    public String toString() {
        return quantidade + " " + nome + " " + "R$ " + preco;
    }
}
