package ocp;

import java.util.Comparator;

public class GeneradorPrimosOrdenInverso extends GeneradorPrimos{

    // sobreescribo el metodo
    protected Comparator<Integer> getOrdination(){
        return (a, b) -> a > b? -1: 1;
    }
}
