package operadores;

public class Exemplo_02 
{
	public static void main(String[] args) {
		//Operadores unarios
		
		int numero = 5;
		//inverter o numero positivo para negativo
		
		numero = -numero;
		
		System.out.println(numero);
		
		//reverter o numero negativo para positivo
		
		numero = numero * -1;
		
		System.out.println(numero);
		
		//variavel recebe ela mesma com incremento do numero 1
		
		//numero +=1;
		numero++;
		System.out.println(numero);
		
		//imprimir numero e depois incrementar
		
		System.out.println(numero++);
		
		System.out.println(numero);
		
		//inverter o valor da variavel atraves do simbolo de negação durante a impressao
		//a variavel continua tendo o mesmo valor, a mudança ocorre quando atribuimos
		//ela mesma a um simbolo de negacao
		
		boolean variavel = false;
		
		System.out.println(variavel);
		
		System.out.println(!variavel);
		
		System.out.println(variavel);
		
		variavel = !variavel;
		
		System.out.println(variavel);
		
		//Operador Ternário
		
		int a,b;
		
		a = 5;
		b = 6;
		
		//String resultado = "";
		
		//Utilizando operador ternario
		
		String resultado = a==b ?"Verdadeiro":"Falso";
		
		if(a==b) 
		{
			resultado = "Verdadeiro";
		}
		else 
		{
			resultado = "Falso";
		}
		System.out.println(resultado);
	}
}
