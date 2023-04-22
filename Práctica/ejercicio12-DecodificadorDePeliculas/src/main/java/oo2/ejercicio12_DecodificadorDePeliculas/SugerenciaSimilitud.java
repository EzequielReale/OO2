package oo2.ejercicio12_DecodificadorDePeliculas;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaSimilitud implements Sugerencia {

	@Override
	public List<Pelicula> sugerirPelicula(Decodificador deco) {
		return deco.getPeliculasReproducidas().stream()
				.map(p->p.getPeliculasSimilares())
				.flatMap(s->s.stream())
				.distinct()
				.limit(3)
				.collect(Collectors.toList());
	}

}
