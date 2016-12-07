package pokemon.model;

public abstract class Pokemon 
{
	private int healthPoints;
	private int attacksPoints;
	private double speed;
	private int number;
	private String name;
	
	public Pokemon (String name, int number)
	{
		this.name = name;
		this.number = number;
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
	
	public String getPOkemonInformation()
	{
		String pokemonInfo = "This pokemon is of type: " + this.getClass().getSimpleName();
		
		return pokemonInfo;
	}

}
