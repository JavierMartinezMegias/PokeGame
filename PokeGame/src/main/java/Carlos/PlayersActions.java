package Carlos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PlayersActions
{
	public List<Pokemon> chooseRandonList(Map<Integer,Pokemon> mapa )
	{
		List<Integer> idList= new ArrayList<Integer>();
		List<Pokemon> pokemonList= new ArrayList<Pokemon>();
		mapa.forEach((Integer,Pokemon) -> idList.add(Integer));
		
		for(int i = 0 ; i<5 ; i++)
		{
			int numero = (int)(Math.random()*idList.size()+1);
			pokemonList.add(mapa.get(idList.get(numero)));
		}
		return pokemonList;
	}
}
