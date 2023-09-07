package apps_polimorfismo;

public class TelegramMessenger extends ServicoMensagemInstantanea
{
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem pelo Telegram!");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo Telegram!");
	}
}
