package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos 
{
	private Map<LocalDate, Evento> eventosMap;

	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventosMap.put(data, evento);
	}
	
	public void exibirAgenda() {
		
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
		
	}
	
	public void obterProximoEvento() {
		
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		
		for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				
				proximaData = entry.getKey();
				proximoEvento = entry.getValue();
				System.out.println("O próximo evento: "+ proximoEvento + "Acontecerá na data: "+ proximaData);
				break;
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JUNE, 10), "Evento 1", "Atração 1");
		agendaEventos.adicionarEvento(LocalDate.of(2023, 6, 25), "Evento 2", "Atração 2");
		agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 25), "Evento 3", "Atração 3");
		agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 10), "Evento 4", "Atração 4");
		
		agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();
	}
	
	
}
