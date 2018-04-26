package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Test;

import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Ingresso;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;
import junit.framework.Assert;

public class DescontoTest {

	@Test
	public void naoDeveConcederDescontoParaIngressoNormal(){
		Filme filme = new Filme("Death Suits You Well", Duration.ofMinutes(120), "Comedia", new BigDecimal("22.5"));
		Sala sala = new Sala("IMAX", new BigDecimal("40.0"));
		Sessao sessao = new Sessao(LocalTime.parse("12:00"), filme, sala);
		
		Ingresso ingresso = new Ingresso(sessao, new SemDesconto());
		
		BigDecimal precoEsperado = filme.getPreco().add(sala.getPreco());
		
		Assert.assertEquals(precoEsperado, ingresso.getPreco());
	}
}
