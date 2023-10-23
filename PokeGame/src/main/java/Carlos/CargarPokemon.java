package Carlos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CargarPokemon
{
	Scanner scanner = new Scanner("C:\\Users\\2DAM\\Desktop\\pokemon.txt");
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	private int numero_pokemon;
	private String nombre_pokemon;
	private String tipo;
	private String tipo2;
	private int total;
	private int HP;
	private int attack;
	private int defense;
	private int sp_atk;
	private int sp_def;
	private int speed;
	private int generation;
	private boolean legendary;
	/*
	 * Metodo que lee el archivo con los datos pokemon y crea un objeto con ellos
	 */
	public void CrearPokemon()
	{
		while(scanner.hasNextLine())
		{
			numero_pokemon = scanner.nextInt();
			nombre_pokemon = scanner.next();
			tipo = scanner.next();
			tipo2 = scanner.next();
			total = scanner.nextInt();
			HP = scanner.nextInt();
			attack = scanner.nextInt();
			defense = scanner.nextInt();
			sp_atk = scanner.nextInt();
			sp_def = scanner.nextInt();
			speed = scanner.nextInt();
			generation = scanner.nextInt();
			legendary = scanner.nextBoolean();
			Pokemon pokemon = new Pokemon(numero_pokemon, nombre_pokemon, tipo, tipo2, total, HP, attack, defense,
											sp_atk, sp_def, speed, generation, legendary);
			CargarPokemon(pokemon);
			
		}
	}
	/*
	 * Metodo que recibe un pokemon y lo carga en un archivo
	 */
	public void CargarPokemon(Pokemon pokemon)
	{
		try
		{
			fos = new FileOutputStream("PokemonCargados.obj");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(pokemon);
			
			oos.flush();
			
		}
		catch(IOException ex)
		{
			
		}
		finally
		{
			try
			{
				oos.close();
				fos.close();
			}
			catch(IOException ex)
			{
				
			}
		}
		
	}
}
