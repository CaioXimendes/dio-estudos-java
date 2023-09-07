package servico_mensagem_instantanea_polimorfismo;

import apps_polimorfismo.FacebookMessenger;
import apps_polimorfismo.MSNMessenger;
import apps_polimorfismo.ServicoMensagemInstantanea;
import apps_polimorfismo.TelegramMessenger;

public class ComputadorCaio
{
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido = "fcb";
		
		if(appEscolhido.equals("msn")) {
			smi = new MSNMessenger();
		}
		else if(appEscolhido.equals("fcb")) {
			smi = new FacebookMessenger();
		}
		else if(appEscolhido.equals("tel")){
			smi = new TelegramMessenger();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
		
	}
}
