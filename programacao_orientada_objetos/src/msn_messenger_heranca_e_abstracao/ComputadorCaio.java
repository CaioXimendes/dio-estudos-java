package msn_messenger_heranca_e_abstracao;

public class ComputadorCaio 
{
	public static void main(String[] args) {
		
		MSNMessenger msn = new MSNMessenger();
		
		msn.enviarMensagem();
		
		msn.receberMensagem();
		
		FacebookMessenger fcb = new FacebookMessenger();
		
		fcb.enviarMensagem();
		
		fcb.receberMensagem();
		
		TelegramMessenger tel = new TelegramMessenger();
		
		tel.enviarMensagem();
		
		tel.receberMensagem();
	}
}
