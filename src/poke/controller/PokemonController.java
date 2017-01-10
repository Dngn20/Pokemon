package poke.controller;

import java.util.ArrayList;

import poke.model.*;
import poke.view.PokemonFrame;


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
