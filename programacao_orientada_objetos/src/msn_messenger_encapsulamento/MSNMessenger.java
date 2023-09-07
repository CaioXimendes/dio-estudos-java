package msn_messenger_encapsulamento;

public class MSNMessenger 
{
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem pelo MSN Messenger!");
	}
	public void receberMensagem() {
		salvarHistoricoMensagem();
		System.out.println("Recebendo Mensagem pelo MSN Messenger!");
	}
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a Internet!");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico de mensagem!");
	}
}
