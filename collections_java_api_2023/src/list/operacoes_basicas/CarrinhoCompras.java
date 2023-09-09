package list.operacoes_basicas;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoCompras {
	private List<Item> itemList;
	
	public CarrinhoCompras() {
		this.itemList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		this.itemList.add(item);
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		if (!itemList.isEmpty()) {
			for(Item i : itemList) {
				if(i.getNome().equalsIgnoreCase(nome)) {
					itensParaRemover.add(i);
				}
			}
			itemList.removeAll(itensParaRemover);
		} else {
			System.out.println("A lista está vazia!");
		}
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0d;
		if(!itemList.isEmpty()) {
			for(Item item : itemList) {
			double valorItem = item.getPreco() * item.getQuantidade();
			valorTotal += valorItem;
			}
			return valorTotal;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public void exibirItens() {
		if(!itemList.isEmpty()) {
			System.out.println(this.itemList);
		} else {
			System.out.println("A lista está vazia!");
		}
	}
	
	public String toString() {
		return "CarrinhoDeCompras{" + "itens=" + itemList + '}';
	}
	
	public static void main(String[] args) {
		CarrinhoCompras carrinho1 = new CarrinhoCompras();
		
		carrinho1.adicionarItem("Lapis", 1d, 1);
		carrinho1.adicionarItem("Caneta",1.5d, 1);
		carrinho1.adicionarItem("Caderno", 20d, 1);
		carrinho1.adicionarItem("Borracha",0.5d,2);
		
		carrinho1.exibirItens();
		
		carrinho1.removerItem("Lapis");
		
		carrinho1.exibirItens();
		
		
		System.out.println("O valor total da compra é = " + carrinho1.calcularValorTotal());
	}
	
}
