package exemplo_polimorfismo;

public class Autodromo 
{
	public static void main(String[] args) 
	{
		Carro redbull = new Carro();
		//redbull.ligar();
		redbull.setChassi("1111111");
		
		Moto hornet = new Moto();
		hornet.setChassi("2222222");
		//hornet.ligar();
		
		Veiculo coringa = redbull;
		
		coringa.ligar();
	}
}
