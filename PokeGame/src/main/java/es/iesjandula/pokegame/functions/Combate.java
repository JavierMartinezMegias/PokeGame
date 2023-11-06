package es.iesjandula.pokegame.functions;

import java.util.List;

import es.iesjandula.pokegame.screens.SeleccionPokemons;

public class Combate {

	
	

	public void combate(Pokemon player1, Pokemon player2, boolean ataqueP1, boolean ataqueP2, List<Pokemon> pokemonsP1 ,List<Pokemon> pokemonsP2)
	{
		SeleccionPokemons sp = new SeleccionPokemons();
		int velocidadP1 = player1.getSpeed();
		int velocidadP2 = player2.getSpeed();
		int dañoP1;
		int dañoP2;
		int vidaP1 = player1.getHP();
		int vidaP2 = player2.getHP();
		int dañoRealizado;
		//Ataca player 1 por mayor velocidad y usa ataque normal
		if(velocidadP1 > velocidadP2 && ataqueP1 == true)
		{
			 dañoP1 = player1.getAttack();
			
			//se calcula el daño que va a hacer y se le resta a la vida de player 2 ya que player 1 es mas rapido
			dañoRealizado = dañoP1 - (player2.getDefense() / 3);
			vidaP2 -= dañoRealizado;
			player2.setHP(vidaP2);
			//si el pokemon de player 2 muere
			if(vidaP2 <= 0)
			{
				
				System.out.println("El pokemon "+ player2.getNombre_pokemon() +" ha muerto");
				pokemonsP2.remove(sp.getSelect2());
				SeleccionPokemons seleccionNueva = new SeleccionPokemons(pokemonsP1, pokemonsP2);
			}
			//si no muere le pega a player 1
			else
			{
				 //comprobar que tipo de ataque usa player 2
				if(ataqueP2 == true)
				{
					 dañoP2 = player2.getAttack();
					 vidaP1 = dañoP2 - (player1.getDefense() / 3);
					 player1.setHP(vidaP1);
						//si player 1 muere
						if(vidaP1 <= 0)
						{
							System.out.println("El pokemon "+ player1.getNombre_pokemon() +" ha muerto");
							pokemonsP2.remove(sp.getSelect1());
							SeleccionPokemons seleccionNueva = new SeleccionPokemons(pokemonsP1, pokemonsP2);
						}
				}
				else
				{
					 dañoP2 = player2.getSp_atk();
					 vidaP1 = dañoP2 - (player1.getSp_def() / 3);
					 player1.setHP(vidaP1);
						//si player 1 muere
						if(vidaP1 <= 0)
						{
							System.out.println("El pokemon "+ player1.getNombre_pokemon() +" ha muerto");
							pokemonsP2.remove(sp.getSelect1());
							SeleccionPokemons seleccionNueva = new SeleccionPokemons(pokemonsP1, pokemonsP2);
						}
				}
				
			}
			//llamar pantalla combate de nuevo
		}
		//playe 1 es mas rapido y usa el ataque especial
		else if(velocidadP1 > velocidadP2 && ataqueP1 == false)
		{
			 dañoP1 = player1.getSp_atk();
			 
				//se calcula el daño que va a hacer y se le resta a la vida de player 2 ya que player 1 es mas rapido
				dañoRealizado = dañoP1 - (player2.getSp_def() / 3);
				vidaP2 -= dañoRealizado;
				player2.setHP(vidaP2);
				//si el pokemon de player 2 muere
				if(vidaP2 <= 0)
				{
					System.out.println("El pokemon "+ player2.getNombre_pokemon() +" ha muerto");
					pokemonsP2.remove(sp.getSelect2());
					SeleccionPokemons seleccionNueva = new SeleccionPokemons(pokemonsP1, pokemonsP2);
				}
				//si no muere le pega a player 1
				if(ataqueP2 == true)
				{
					 dañoP2 = player2.getAttack();
					 vidaP1 = dañoP2 - (player1.getDefense() / 3);
					 player1.setHP(vidaP1);
						//si player 1 muere
						if(vidaP1 <= 0)
						{
							System.out.println("El pokemon "+ player1.getNombre_pokemon() +" ha muerto");
							pokemonsP2.remove(sp.getSelect1());
							SeleccionPokemons seleccionNueva = new SeleccionPokemons(pokemonsP1, pokemonsP2);
						}
				}
				else
				{
					 dañoP2 = player2.getSp_atk();
					 vidaP1 = dañoP2 - (player1.getSp_def() / 3);
					 player1.setHP(vidaP1);
					 if(vidaP1 <= 0)
						{
							System.out.println("El pokemon" + player1.getNombre_pokemon() +" ha muerto");
							pokemonsP2.remove(sp.getSelect1());
							SeleccionPokemons seleccionNueva = new SeleccionPokemons(pokemonsP1, pokemonsP2);
						}
				}
				
		}
		//player 2 es mas rapido y usa ataque normal
		else if(velocidadP2 > velocidadP1 && ataqueP2 == true)
		{
			 dañoP2 = player2.getAttack();
			 
			 dañoRealizado = dañoP2 - (player1.getDefense() / 3);
			 
			 vidaP1 -= dañoRealizado;
			 player1.setHP(vidaP1);
			 
			 if(vidaP1 <= 0)
			 {
				 System.out.println("El pokemon " + player1.getNombre_pokemon() + " ha muerto");
				 pokemonsP1.remove(sp.getSelect1());
				 SeleccionPokemons seleccionNueva = new SeleccionPokemons(pokemonsP1, pokemonsP2);
			 }
			 else
			 {
				 if(ataqueP1 == true)
				 {
					 dañoP1 = player1.getAttack();
					 
					 dañoRealizado = dañoP1 - (player2.getDefense() / 3);
					 
					 vidaP2 -= dañoRealizado;
					 player2.setHP(vidaP2);
					 
					 if(vidaP2 <= 0)
					 {
						 System.out.println("El pokemon " + player2.getNombre_pokemon() + " ha muerto");
						 pokemonsP1.remove(sp.getSelect2());
						 SeleccionPokemons seleccionNueva = new SeleccionPokemons(pokemonsP1, pokemonsP2);
					 }
					 
				 }
				 else
				 {
					 dañoP1 = player1.getSp_atk();
					 
					 dañoRealizado = dañoP1 - (player2.getSp_def() / 3);
					 
					 vidaP2 -= dañoRealizado;
					 player2.setHP(vidaP2);
					 
					 if(vidaP2 <= 0)
					 {
						 System.out.println("El pokemon " + player2.getNombre_pokemon() + " ha muerto");
						 pokemonsP1.remove(sp.getSelect2());
						 SeleccionPokemons seleccionNueva = new SeleccionPokemons(pokemonsP1, pokemonsP2);
					 }
				 }
			 }
		}
		//player 2 es mas rapido y usa ataque especial
		else
		{
			 dañoP2 = player2.getSp_atk();
			 
			 dañoRealizado = dañoP2 - (player2.getSp_def() / 3);
			 
			 vidaP1 -= dañoRealizado;
			 player1.setHP(vidaP1);
			 if(vidaP1 == 0)
			 {
				 System.out.println("El pokemon " + player1.getNombre_pokemon() + " ha muerto");
				 pokemonsP1.remove(sp.getSelect1());
				 SeleccionPokemons seleccionNueva = new SeleccionPokemons(pokemonsP1, pokemonsP2);
			 }
			 else
			 {
				 if(ataqueP1 == true)
				 {
					 dañoP1 = player1.getAttack();
					 
					 dañoRealizado = dañoP1 - (player2.getDefense() / 3);
					 
					 vidaP2 -= dañoRealizado;
					 player2.setHP(vidaP2);
					 
					 if(vidaP2 == 0)
					 {
						 System.out.println("El pokemon " + player2.getNombre_pokemon() + " ha muerto");
						 pokemonsP1.remove(sp.getSelect2());
						 SeleccionPokemons seleccionNueva = new SeleccionPokemons(pokemonsP1, pokemonsP2);
					 }
					 
				 }
				 else
				 {
					 dañoP1 = player1.getSp_atk();
					 
					 dañoRealizado = dañoP1 - (player2.getSp_def() / 3);
					 
					 vidaP2 -= dañoRealizado;
					 player2.setHP(vidaP2);
					 
					 if(vidaP2 == 0)
					 {
						 System.out.println("El pokemon " + player2.getNombre_pokemon() + " ha muerto");
						 pokemonsP1.remove(sp.getSelect2());
						 SeleccionPokemons seleccionNueva = new SeleccionPokemons(pokemonsP1, pokemonsP2);
					 }
				 }
			 }
		}
	}
	
}
