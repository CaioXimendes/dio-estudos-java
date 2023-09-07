package exemplo_polimorfismo;

public class Carro extends Veiculo
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
