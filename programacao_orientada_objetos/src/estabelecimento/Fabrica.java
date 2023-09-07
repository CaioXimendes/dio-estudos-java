package estabelecimento;

import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;
import equipamentos.digitalizadora.Digitalizadora;


public class Fabrica {
	public static void main(String[] args) {
		Impressora impressora1 = new Deskjet();
		impressora1.imprimir();
		
		Impressora impressora2 = new EquipamentoMultifuncional();
		impressora2.imprimir();
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Digitalizadora digitalizadora1 = em;
		
		digitalizadora1.digitalizar();
	}
}
