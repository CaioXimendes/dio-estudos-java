package subsistema2.nomesequipesf1;


public class EquipesF1Api {
	
private static EquipesF1Api instancia = new EquipesF1Api();
	
	private EquipesF1Api() {
		
	}
	
	public static EquipesF1Api getInstancia(){
		
		return instancia;
	}
	
	public String recuperarEquipe(String nomeEquipe) {
		if(nomeEquipe.equalsIgnoreCase("Mercedes")) {
			return "\n Lewis Hamilton \n George Russel";
		}
		else if(nomeEquipe.equalsIgnoreCase("Red Bull")) {
			return "\n Max Vertappen \n Sergio Perez";
		}
		else if(nomeEquipe.equalsIgnoreCase("Ferrari")) {
			return "\n Charles Leclerc \n Carlos Sainz";
		}
		else if(nomeEquipe.equalsIgnoreCase("Mclaren")) {
			return "\n Lando Norris \n Oscar Piastri";
		}
		else if(nomeEquipe.equalsIgnoreCase("Aston Martin")) {
			return "\n Fernando Alonso \n Lance Stroll";
		}
		else if(nomeEquipe.equalsIgnoreCase("Alpine")) {
			return "\n Pierre Gasly \n Esteban Ocon";
		}
		else if(nomeEquipe.equalsIgnoreCase("Willians")) {
			return "\n Alexander Albon \n Logan Sargeant";
		}
		else if(nomeEquipe.equalsIgnoreCase("Haas")) {
			return "\n Nico Hulkenberg \n Kevin Magnussem";
		}
		else if(nomeEquipe.equalsIgnoreCase("Alfa Romeo")) {
			return "\n Valtteri Bottas \n Guanyu Zhou";
		}
		else if(nomeEquipe.equalsIgnoreCase("AlphaTauri")) {
			return "\n Yuki Tsunoda \n Liam Lawson";
		}
		return nomeEquipe;
	}
}
