package ocp;

import java.util.Arrays;
import java.util.List;

import ocp.GeneradorPrimos;
import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;

public class TestGeneradorPrimos {
	
	@Test
	public void test_orden_natural() {
		
		GeneradorPrimos generador = new GeneradorPrimos();
		List<Integer> expected = Arrays.asList(2,3,5,7,11,13);
		
		Assert.assertThat(generador.getPrimeNumber(15), is(expected));
	}	

	@Test
	public void test_orden_inverso() {
		
		GeneradorPrimosOrdenInverso generadorPrimosOrdenInverso = new GeneradorPrimosOrdenInverso();
		List<Integer> expected = Arrays.asList(13,11,7,5,3,2);

		//getPrimeNumber usa el getOrdination() de la sub clase orden inverso, no la usa de la clase padre
		Assert.assertThat(generadorPrimosOrdenInverso.getPrimeNumber(15), is(expected));
	}	

}
