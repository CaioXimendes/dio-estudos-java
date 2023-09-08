package list.operacoes_basicas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {
	private List<Tarefa> tarefaList;
	
	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover =  new ArrayList<>();
		for(Tarefa t: tarefaList) {
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
	public static void main(String[] args) {
		ListaTarefa listatarefa = new ListaTarefa();
		System.out.println("O número total de elementos na lista: "+ listatarefa.obterNumeroTotalTarefas());
		listatarefa.adicionarTarefa("Tarefa 1");
		listatarefa.adicionarTarefa("Tarefa 1");
		listatarefa.adicionarTarefa("Tarefa 2");
		System.out.println("O número total de elementos na lista: "+ listatarefa.obterNumeroTotalTarefas());
		//listatarefa.removerTarefa("Tarefa 1");
		System.out.println("O número total de elementos na lista: "+ listatarefa.obterNumeroTotalTarefas());
		listatarefa.obterDescricoesTarefas();
	}

}
