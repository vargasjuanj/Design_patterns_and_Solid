package org.formacion.srp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Recomendador {

	public List<Pelicula> recomendaciones (Cliente cliente) {
		
		List<Pelicula> recomendadas = new ArrayList<>();

		//Map<String, List<Pelicula>> pruebas =  BBDD.PELIS_POR_DIRECTOR;
		//System.out.println(pruebas.get("Spielberg"));

		for (Pelicula favorita: cliente.getFavoritas()) {
			//con el AddAll agrega varias peliculas al array
			recomendadas.addAll(BBDD.PELIS_POR_DIRECTOR.get(favorita.getDirector()));
		}
		// aquí quita la de ET, y solo queda salvando al Soldado Ryan
		recomendadas.removeAll(cliente.getFavoritas());
		
		return recomendadas;
	}

	//pierde esta responsabilidad
/*	public String recomendacionesCSV (Cliente cliente) {
		
		return recomendaciones(cliente).stream()
		      .map(p -> (p.getTitulo() + "," + p.getGenero() + "," + p.getDirector()))
		      .collect(Collectors.joining("\n"));
	}*/
}
