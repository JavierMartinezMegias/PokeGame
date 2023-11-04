package Carlos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Launcher
{
	private static final Logger log = LogManager.getLogger();
	
	public static void main(String[] args)
	{
		Map<Integer,Pokemon> pokemons = new TreeMap<Integer,Pokemon>();
		List<Pokemon> player1 = new ArrayList<Pokemon>();
		List<Pokemon> player2 = new ArrayList<Pokemon>();
		
		PlayersActions playersActions = new PlayersActions();

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
		
		player1 = playersActions.chooseRandonList(pokemons);
		player2 = playersActions.chooseRandonList(pokemons);
		
		System.out.println(player1.toString());
		System.out.println(player2.toString());
		new File("PokemonCargados.obj").delete();
		
		
	}

}
