package padrao_facade;

import subsistema1.crm.CrmService;
import subsistema2.nomesequipesf1.EquipesF1Api;

public class Facade {
	
	
	public void migrarEquipe(String nomeEquipe) {
		
		String equipe = EquipesF1Api.getInstancia().recuperarEquipe(nomeEquipe);
		CrmService.gravarEquipe(nomeEquipe, equipe);
	}
}
