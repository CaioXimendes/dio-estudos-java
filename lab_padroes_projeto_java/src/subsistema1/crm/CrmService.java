package subsistema1.crm;

public class CrmService {
	
	private CrmService(){
		
	}
	
	public static void gravarEquipe(String nomeEquipe, String equipe) {
		System.out.println("Equipe Salva no sistema CRM");
		System.out.println("A equipe "+nomeEquipe+", possuem os pilotos:"+equipe);
	}
}
