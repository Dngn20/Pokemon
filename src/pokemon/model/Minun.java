package pokemon.model;

public class Minun extends Pokemon implements Electric
{
	public Minun()
	{
		super("Minun", 312);
		setSpeed(6);
		setAttackPoints(4);
		setHealthPoints(3);
	}
	
	public Minun(String name)
	{
		super(name, 312);
		setSpeed(6);
		setAttackPoints(4);
		setHealthPoints(3);
	}


	public int Thunderbolt()
	{
		return 4;
	}

	public int Thunder()
	{
		return 6;
	}
}


