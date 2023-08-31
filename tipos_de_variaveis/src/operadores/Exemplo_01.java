package operadores;

public class Exemplo_01 
{
	public static void main(String[] args) 
	{
		
	String nomeCompleto = "Caio" + " " + "Ximendes";
	System.out.println(nomeCompleto);
	
	String concatenacao = 1+1+1+"1";
	
	System.out.println(concatenacao);
	
	concatenacao = 1+"1"+1+1;
	
	System.out.println(concatenacao);
	
	concatenacao = 1+"1"+1+"1";
	
	System.out.println(concatenacao);
	
	concatenacao = "1"+1+1+1;
	
	System.out.println(concatenacao);
	
	concatenacao = "1"+(1+1+1);
	
	System.out.println(concatenacao);
	
	}
}
