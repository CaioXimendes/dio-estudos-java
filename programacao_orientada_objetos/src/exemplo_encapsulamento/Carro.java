package exemplo_encapsulamento;

public class Carro 
{
	public void ligar() {
		confereCombustivel();
		confereCambio();
		System.out.println("Carro Ligado!");
	}
	private void confereCombustivel() {
		System.out.println("Conferindo combustivel");
	}
	private void confereCambio() {
		System.out.println("Conferindo cambio em N(neutro)");
	}
}
