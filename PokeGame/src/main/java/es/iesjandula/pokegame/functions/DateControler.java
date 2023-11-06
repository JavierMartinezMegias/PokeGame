package es.iesjandula.pokegame.functions;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DateControler
{
	private static final Logger log = LogManager.getLogger();

	public void parsePokemonsToFileLikeObjecs(String ruta, Pokemon pokemon) throws UnidadUnoExcepcion
	{
		
		ObjectOutputStream objectOutputStream = null;

		try
		{			
			objectOutputStream = new MyObjectOutputStream(ruta);

			objectOutputStream.writeObject(pokemon);
			objectOutputStream.flush();
		} catch (FileNotFoundException exception)
		{
			String error = "No se ha encontrado el fichero";
			log.error(error, exception);
			throw new UnidadUnoExcepcion(error, exception);
		} catch (IOException exception)
		{
			String error = "Error con el fichero";
			log.error(error, exception);
			throw new UnidadUnoExcepcion(error, exception);
		} finally
		{
			if (objectOutputStream != null)
			{
				try
				{
					objectOutputStream.close();
				} catch (IOException exception)
				{
					String error = "Error al cerrar el fichero";
					log.error(error, exception);
					throw new UnidadUnoExcepcion(error, exception);
				}

			}
		}
	}

	

	public Map<Integer,Pokemon> getPokemonsFromFileAndCreateList(String ruta) throws UnidadUnoExcepcion
	{
		File file = new File(ruta);
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		Map<Integer,Pokemon> pokemons = new TreeMap<Integer,Pokemon>();

		try
		{
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);

			try
			{
				while (true)
				{
					Pokemon pokemon = ((Pokemon) objectInputStream.readObject());
					pokemons.put(pokemon.getNumero_pokemon(), pokemon);
				}
			} catch (EOFException exception)
			{
				log.info("Lista de pokemons cargada");
			}

		} catch (FileNotFoundException exception)
		{
			String error = "No se ha encontrado el fichero";
			log.error(error, exception);
			throw new UnidadUnoExcepcion(error, exception);
		} catch (IOException exception)
		{
			String error = "Error con el fichero";
			log.error(error, exception);
			throw new UnidadUnoExcepcion(error, exception);
		} catch (ClassNotFoundException exception)
		{
			String error = "Clase no encontrada";
			log.error(error, exception);
			throw new UnidadUnoExcepcion(error, exception);
		} finally
		{
			if (objectInputStream != null)
			{
				try
				{
					objectInputStream.close();
				} catch (IOException exception)
				{
					String error = "Error al cerrar el fichero";
					log.error(error, exception);
					throw new UnidadUnoExcepcion();
				}
			}
			if (fileInputStream != null)
			{
				try
				{
					fileInputStream.close();
				} catch (IOException exception)
				{
					String error = "Error al cerrar el fichero";
					log.error(error, exception);
					throw new UnidadUnoExcepcion();
				}
			}
		}

		return pokemons;

	}

	public void chargeNewPokemonsToFile(String pathNewPokemons, String pathToPutPokemons) throws UnidadUnoExcepcion
	{
		File file = new File(pathNewPokemons);
		DateControler infoControl = null;
		Scanner scanner = null;

		int numero_pokemon;
		String nombre_pokemon;
		String tipo;
		String tipo2;
		int total;
		int HP;
		int attack;
		int defense;
		int sp_atk;
		int sp_def;
		int speed;
		int generation;
		boolean legendary;
		String url;

		try
		{
			scanner = new Scanner(file);
			while (scanner.hasNextLine())
			{

				numero_pokemon = scanner.nextInt();
				nombre_pokemon = scanner.next();
				tipo = scanner.next();
				if (scanner.hasNext("null"))
				{
					tipo2 = null;
					scanner.next();
				} else
				{
					tipo2 = scanner.next();
				}
				total = scanner.nextInt();
				HP = scanner.nextInt();
				attack = scanner.nextInt();
				defense = scanner.nextInt();
				sp_atk = scanner.nextInt();
				sp_def = scanner.nextInt();
				speed = scanner.nextInt();
				generation = scanner.nextInt();
				legendary = scanner.nextBoolean();
				url = scanner.next();
				Pokemon pokemon = new Pokemon(numero_pokemon, nombre_pokemon, tipo, tipo2, total, HP, attack, defense,
						sp_atk, sp_def, speed, generation, legendary, url);

				infoControl = new DateControler();
				try
				{
					infoControl.parsePokemonsToFileLikeObjecs(pathToPutPokemons, pokemon);

				} catch (UnidadUnoExcepcion exception)
				{
					String error = "Error al cerrar el fichero";
					log.error(error, exception);
					throw new UnidadUnoExcepcion(error, exception);
				}

			}
		} 
		catch (FileNotFoundException exception)
		{
			String error = "Error al encontrar el fichero";
			log.error(error, exception);
			throw new UnidadUnoExcepcion(error, exception);
		} 
		finally
		{
			if (scanner != null)
			{
				scanner.close();
			}

		}
	}
}
