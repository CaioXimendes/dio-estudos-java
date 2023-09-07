package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
	public void copiar() {
		System.out.println("Copiando através do Equipamento Multifuncional!");
	}
	public void digitalizar() {
		System.out.println("Digitalizando através do Equipamento Multifuncional!");
	}
	public void imprimir() {
		System.out.println("Imprimindo através do Equipamento Multifuncional!");
	}
}
