package pokemon.controller;

import pokemon.model.Pokemon;
import pokemon.view.PokemonFrame;
import java.util.ArrayList;
import pokemon.model.*;


public class PokemonController 
{
	private PokemonFrame baseFrame;
	
	public PokemonController()
	{
		baseFrame = new PokemonFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public PokemonFrame getBaseFrame()
	{
		return baseFrame;
	}
}
