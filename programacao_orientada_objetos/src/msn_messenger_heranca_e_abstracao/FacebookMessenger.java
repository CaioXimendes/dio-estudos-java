package msn_messenger_heranca_e_abstracao;

public class FacebookMessenger extends ServicoMensagemInstantanea{
	
	public void enviarMensagem() {
		System.out.println("Enviando Mensagem pelo Facebook!");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo Facebook!");
	}

}
