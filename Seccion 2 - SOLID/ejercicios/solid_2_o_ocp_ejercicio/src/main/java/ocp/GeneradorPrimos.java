package ocp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GeneradorPrimos {

	
	public List<Integer> getPrimeNumber (int limit) {
		
		List<Integer> primos = new ArrayList();
		for (int i = 2; i < limit; i++) {
			if (isPrimeNumber(i)) {
				primos.add(i);
			}
		}

		//ordena el array primo, es por referencia, por eso ya se devuelve modificado
		Collections.sort(primos, getOrdination());
		return primos;

	}
	
	private boolean isPrimeNumber (int candidato) {
		for (int i = 2; i < candidato; i++) {
			if (candidato % i == 0) {
				return false;
			}
		}
		
		return true;
	}

	//Se pone protected para que las subclases la vayan sobrescribiendo, y el metodo getPrimeNumbers haga uso de esa sobreescritura, dependiendo de la subclase
   protected Comparator<Integer> getOrdination(){
		return (a, b) -> a > b ? 1: -1; // en este caso es la ordenacion natural, comportamiento por defecto
   }
}
