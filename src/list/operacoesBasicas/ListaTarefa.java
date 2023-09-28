package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    //construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //metodos
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        //cada tarefa de dentro do tarefalist
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    //metodo main para os testes
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de tarefas da lista é: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1A");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de tarefas da lista é: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1A");
        System.out.println("O numero total de tarefas da lista é: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
