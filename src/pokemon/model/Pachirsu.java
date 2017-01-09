package pokemon.model;

public class Pachirsu extends Pokemon implements Electric
{
	public Pachirsu()
	{
		super("Pachirsu", 417);
		setSpeed(6);
		setAttackPoints(4);
		setHealthPoints(3);
	}

	public Pachirsu(String name)
	{
		super(name, 417);
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
