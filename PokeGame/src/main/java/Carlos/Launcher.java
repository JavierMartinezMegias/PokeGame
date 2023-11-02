package Carlos;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Launcher
{
	private static final Logger log = LogManager.getLogger();
	
	public static void main(String[] args)
	{
		List<Pokemon> pokemons = new ArrayList<Pokemon>();
		DateControler cp = new DateControler();
		try
		{
			cp.chargeNewPokemonsToFile("DatosPokemon.txt", "PokemonCargados.obj");
		} catch (UnidadUnoExcepcion exception)
		{
			String error = "Erro con el juego";
			log.error(error,exception);			
		}
		try
		{
			pokemons = cp.getPokemonsFromFileAndCreateList("PokemonCargados.obj");
		} catch (UnidadUnoExcepcion exception)
		{
			String error = "Erro con el juego";
			log.error(error,exception);
		}
		
		System.out.println(pokemons.size());
	}

}
