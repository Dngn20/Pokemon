package pokemon.model;

public class Plusle extends Pokemon implements Electric
{
	public Plusle()
	{
		super("Plusle", 311);
		setSpeed(6);
		setAttackPoints(4);
		setHealthPoints(3);
	}
	
	public Plusle(String name)
	{
		super(name, 311);
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
