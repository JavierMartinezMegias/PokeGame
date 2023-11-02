package Carlos;

import java.io.Serializable;

public class Pokemon implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1857552681478326645L;
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

	public Pokemon(int numero_pokemon, String nombre_pokemon, String tipo, String tipo2, int total, int HP, int attack,
			int defense, int sp_atk, int sp_def, int speed, int generation, boolean legendary)
	{

		this.numero_pokemon = numero_pokemon;
		this.nombre_pokemon = nombre_pokemon;
		this.tipo = tipo;
		this.tipo2 = tipo2;
		this.total = total;
		this.HP = HP;
		this.attack = attack;
		this.defense = defense;
		this.sp_atk = sp_atk;
		this.sp_def = sp_def;
		this.speed = speed;
		this.generation = generation;
		this.legendary = legendary;
	}

	public int getNumero_pokemon()
	{
		return numero_pokemon;
	}

	public void setNumero_pokemon(int numero_pokemon)
	{
		this.numero_pokemon = numero_pokemon;
	}

	public String getNombre_pokemon()
	{
		return nombre_pokemon;
	}

	public void setNombre_pokemon(String nombre_pokemon)
	{
		this.nombre_pokemon = nombre_pokemon;
	}

	public String getTipo()
	{
		return tipo;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public String getTipo2()
	{
		return tipo2;
	}

	public void setTipo2(String tipo2)
	{
		this.tipo2 = tipo2;
	}

	public int getTotal()
	{
		return total;
	}

	public void setTotal(int total)
	{
		this.total = total;
	}

	public int getHP()
	{
		return HP;
	}

	public void setHP(int hP)
	{
		HP = hP;
	}

	public int getAttack()
	{
		return attack;
	}

	public void setAttack(int attack)
	{
		this.attack = attack;
	}

	public int getDefense()
	{
		return defense;
	}

	public void setDefense(int defense)
	{
		this.defense = defense;
	}

	public int getSp_atk()
	{
		return sp_atk;
	}

	public void setSp_atk(int sp_atk)
	{
		this.sp_atk = sp_atk;
	}

	public int getSp_def()
	{
		return sp_def;
	}

	public void setSp_def(int sp_def)
	{
		this.sp_def = sp_def;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}

	public int getGeneration()
	{
		return generation;
	}

	public void setGeneration(int generation)
	{
		this.generation = generation;
	}

	public boolean isLegendary()
	{
		return legendary;
	}

	public void setLegendary(boolean legendary)
	{
		this.legendary = legendary;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Pokemon [numero_pokemon=");
		builder.append(numero_pokemon);
		builder.append(", nombre_pokemon=");
		builder.append(nombre_pokemon);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", tipo2=");
		builder.append(tipo2);
		builder.append(", total=");
		builder.append(total);
		builder.append(", HP=");
		builder.append(HP);
		builder.append(", attack=");
		builder.append(attack);
		builder.append(", defense=");
		builder.append(defense);
		builder.append(", sp_atk=");
		builder.append(sp_atk);
		builder.append(", sp_def=");
		builder.append(sp_def);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", generation=");
		builder.append(generation);
		builder.append(", legendary=");
		builder.append(legendary);
		builder.append("]");
		return builder.toString();
	}
	
	

}
