package msn_messenger_heranca_e_abstracao;

public class TelegramMessenger extends ServicoMensagemInstantanea
{
	public void enviarMensagem() {
		System.out.println("Enviando Mensagem pelo Telegram!");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo Telegram!");
	}
}
