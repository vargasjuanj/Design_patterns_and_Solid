package org.formacion.srp;

import java.util.List;

import org.junit.Test;

import org.junit.Assert;

public class TestRecomendador {

	@Test
	public void test() {
		Recomendador recomendador = new Recomendador();
		
		List<Pelicula> recomendaciones = recomendador.recomendaciones(BBDD.JUAN);
		
		Assert.assertFalse(recomendaciones.contains(BBDD.ET));
	}
	
	@Test 
	public void test_formato() {

		Recomendador recomendador = new Recomendador();

		ExportadorCSV exportador = new ExportadorCSV();

		String csv = exportador.export(recomendador.recomendaciones(BBDD.JUAN));
		
		String esperado = "Salvar al soldado Ryan,Spielberg,belico";
		
		Assert.assertEquals(esperado, csv);

	}

}
