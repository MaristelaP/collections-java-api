package list.operacoesBasicas;

public class Tarefa {
    //atributo
    private String descricao;

    //construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //metodo get
    public String getDescricao() {
        return descricao;
    }

    //método to string para retornar o valor da descricao

    @Override
    public String toString() {
        return descricao;
    }
}
