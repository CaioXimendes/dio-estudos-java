package exemplo_heranca;

public class Autodromo 
{
	public static void main(String[] args) 
	{
		Carro redbull = new Carro();
		redbull.ligar();
		redbull.setChassi("1238456");
		
		Moto hornet = new Moto();
		hornet.setChassi("9994985");
	}
}