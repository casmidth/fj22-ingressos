package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

public class SessaoTest {

	@Test
	public void oPrecoDaSessaoDeveSerIgualASOmaDoPrecoDaSalaMaisOPrecoDoFilme(){
		Filme filme = new Filme("Death Suits You Well", Duration.ofMinutes(120), "Comedia", new BigDecimal("22.5"));
		Sala sala = new Sala("IMAX", new BigDecimal("40.0"));
		BigDecimal somaDosPrecosDaSalaEFilme = filme.getPreco().add(sala.getPreco());
		
		Sessao sessao = new Sessao(LocalTime.parse("12:00"), filme, sala);
		Assert.assertEquals(somaDosPrecosDaSalaEFilme, sessao.getPreco());
	}
}
