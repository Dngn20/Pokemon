package pokemon.model;

public class Lapris extends Pokemon implements Ice,Water
{
	public Lapris()
	{
		super("Lapris", 131);
		setSpeed(4);
		setAttackPoints(6);
		setHealthPoints(9);
	}

	public Lapris(String name)
	{
		super(name, 131);
		setSpeed(4);
		setAttackPoints(6);
		setHealthPoints(9);
	}
	
	public int IceBeam()
	{
		return 7;
	}
	public int Hail()
	{
		return 4;
	}

	public int Surf()
	{
		return 7;
	}
	public int Bubble()
	{
		return 4;
	}
	






}
