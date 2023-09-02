package exerciciosPOO;

public class Televisao 
{
	boolean ligada = false;
	int volume;
	int canal;
	
	public boolean ligar() 
	{
		return ligada = true;
	}
	
	public boolean desligar()
	{
		return ligada = false;
	}
	
	public int aumentarVolume()
	{
		if(ligada == true) 
		{
			return ++volume;
		}
		else 
		{
			return volume;
		}
	}
	
	public int diminuirVolume()
	{
		return volume--;
	}
	
	public int alterarCanal(int a)
	{
		return canal;
	}

}
