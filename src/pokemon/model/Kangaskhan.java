package pokemon.model;

public class Kangaskhan extends Pokemon implements Normal
{
	public Kangaskhan()
	{
		super("Kangaskhan", 115);
		setSpeed(3);
		setAttackPoints(7);
		setHealthPoints(9);
	}

	public Kangaskhan(String name)
	{
		super(name, 155);
		setSpeed(3);
		setAttackPoints(7);
		setHealthPoints(9);
	}

	public int MegaPunch()
	{
		return 8;
	}
	
	public int MegaKick()
	{
		return 9;
	}
}
