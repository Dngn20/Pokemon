package poke.controller;

import java.util.ArrayList;
import poke.model.*;
import poke.view.PokemonFrame;



public class PokemonController 
{
	private ArrayList<Pokemon> pokedex;
	private PokemonFrame baseFrame;
	public Plusle plusle;
	public Minun minun;
	public Lapris lapris;
	public Kangaskhan kangaskhan;
	public Pachirsu pachirsu;
	public Pachirsu electricSquirrel;
	
	
	public PokemonController()
	{
		
		this.pokedex = new ArrayList<Pokemon>();
		makePokedex();
		baseFrame = new PokemonFrame(this);
	}
	
	public void updateSelected(int index, String name, int attack, int health, double speed)
	{
		Pokemon currentPokemon = pokedex.get(index);
		currentPokemon.setName(name);
		currentPokemon.setAttackPoints(attack);
		currentPokemon.setHealthPoints(health);
		currentPokemon.setSpeed(speed);
	}
	private void makePokedex()
	{
		plusle = new Plusle();
		minun  = new Minun();
		lapris = new Lapris();
		kangaskhan = new Kangaskhan();
		pachirsu = new Pachirsu();
		electricSquirrel = new Pachirsu("ElectricSquirrel");
		
		pokedex.add(plusle);
		pokedex.add(minun);
		pokedex.add(kangaskhan);
		pokedex.add(pachirsu);
		pokedex.add(lapris);
		pokedex.add(electricSquirrel);
	}	
	
	public ArrayList<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public void start()
	{
		
	}
	
	public PokemonFrame getBaseFrame()
	{
		return baseFrame;
	}
	
}
