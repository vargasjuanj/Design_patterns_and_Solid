package org.formacion.srp;

import java.util.List;
import java.util.stream.Collectors;

/*

Le quitamos responsabilidad a Recomendador, y la exportación estara a cargo de esta clase
 */
public class ExportadorCSV {
    public String export (List<Pelicula> peliculas){
        return  peliculas.stream()
                .map(p -> (p.getTitulo() + "," + p.getDirector() + "," + p.getGenero()))
                .collect(Collectors.joining("\n"));
    }
}
