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
		
	}
}
