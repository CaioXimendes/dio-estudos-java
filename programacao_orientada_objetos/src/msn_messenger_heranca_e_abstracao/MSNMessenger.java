package msn_messenger_heranca_e_abstracao;

public class MSNMessenger extends ServicoMensagemInstantanea
{
	public void enviarMensagem() {
		System.out.println("Enviando Mensagem pelo MSN!");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo MSN!");
	}
}
