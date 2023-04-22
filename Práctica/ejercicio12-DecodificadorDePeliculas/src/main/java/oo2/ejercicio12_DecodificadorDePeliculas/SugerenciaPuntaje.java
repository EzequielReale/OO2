package oo2.ejercicio12_DecodificadorDePeliculas;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaPuntaje implements Sugerencia {

	@Override
	public List<Pelicula> sugerirPelicula(Decodificador deco) {
		return deco.getGrillaDePeliculas().stream()
				.sorted((p2, p1) -> p1.tengoMasPuntaje(p2))
				.limit(3)
				.collect(Collectors.toList());
	}
}
