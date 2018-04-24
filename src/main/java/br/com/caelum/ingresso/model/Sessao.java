package br.com.caelum.ingresso.model;

import java.time.LocalTime;

public class Sessao {

	private Integer sessaoId;
	private LocalTime horario;
	private Filme filme;
	private Sala sala;
	
	public Sessao(LocalTime horario, Filme filme, Sala sala){
		this.horario = horario;
		this.filme = filme;
		this.sala = sala;
	}
	
	public LocalTime getHorarioTermino(){
		return this.horario.plusMinutes(filme.getDuracao().toMinutes());
	}
	
	public Integer getSessaoId() {
		return sessaoId;
	}
	
	public void setSessaoId(Integer sessaoId) {
		this.sessaoId = sessaoId;
	}
	
	public LocalTime getHorario() {
		return horario;
	}
	
	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}
	
	public Filme getFilme() {
		return filme;
	}
	
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	public Sala getSala() {
		return sala;
	}
	
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
		
}
