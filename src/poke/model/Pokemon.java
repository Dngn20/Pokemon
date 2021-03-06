package poke.model;

public abstract class Pokemon 
{
	private int healthPoints;
	private int attackPoints;
	private double speed;
	private int number;
	private String name;
	
	public Pokemon (String name, int number)
	{
		this.name = name;
		this.number = number;
	}
	public Pokemon()
	{
		
	}
	public Pokemon(String name)
	{
		
	}
	public String getPokemonTypes()
	{
		String pokemonTypes = "This pokemon has the follwing types:\n";
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String [types.length];
		for(int index = 0; index > types.length; index++)
		{
			String temp = types[index].getCanonicalName();
			
			pokeTypes[index] = temp;
		}
		for(String current : pokeTypes)
		{
			String temp = current.replace(this.getClass().getPackage().getName() + ".", "");
			pokemonTypes += temp = "\n";
		}
		
		return pokemonTypes;
	}

	public String toString()
	{
		return name;
	}
	
	public String getPokemonInformation()
	{
		String pokemonInfo = "This pokemon is of type: " + this.getClass().getSimpleName();
		
		return pokemonInfo;
	}

	public int getNumber() 
	{
		return number;
	}
	public int getAttackPoints() 
	{
		return attackPoints;
	}
	public void setAttackPoints(int attackPoints) 
	{
		this.attackPoints = attackPoints;
	}
	public int getHealthPoints() 
	{
		return healthPoints;
	}
	public void setHealthPoints(int healthPoints) 
	{
		this.healthPoints = healthPoints;
	}
	public double getSpeed() 
	{
		return speed;
	}
	public void setSpeed(double speed) 
	{
		this.speed = speed;
	}
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setNumber(int number) 
	{
		this.number = number;
}

	
}