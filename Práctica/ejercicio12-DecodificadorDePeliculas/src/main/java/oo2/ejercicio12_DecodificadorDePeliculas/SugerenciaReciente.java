package oo2.ejercicio12_DecodificadorDePeliculas;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaReciente implements Sugerencia {

	@Override
	public List<Pelicula> sugerirPelicula(Decodificador deco) {
		return deco.getGrillaDePeliculas().stream()
				.sorted((p2, p1) -> p1.soyMasReciente(p2))
				.limit(3)
				.collect(Collectors.toList());
	}
}
