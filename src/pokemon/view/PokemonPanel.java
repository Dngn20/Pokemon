package pokemon.view;

import javax.swing.*;
import pokemon.controller.PokemonController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private ImageIcon pokemonIcon;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private SpringLayout baseLayout;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	public PokemonPanel(PokemonController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("images/oldpokeball.jpg"));
		this.updateButton = new JButton("You gots to update the stats");
		this.nameField = new JTextField(25);
		this.combatField = new JTextField(5);
		this.healthField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea(10,25);
		this.advancedLabel = new JLabel("Advanced Information");
		this.combatLabel = new JLabel("Combat Points");
		this.healthLabel = new JLabel("Health Points");
		this.speedLabel = new JLabel("Speed Points");
		this.numberLabel = new JLabel("PokemonNumber");
		this.nameLabel = new JLabel("Name");
		this.pokedexSelector = new JComboBox(new String [] {"Sceptile, Scizor, Snorlax , Golurk, Flygon"});
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 91, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokedexSelector, 901, SpringLayout.SOUTH, this);
		
		this.pokemonLabel = new JLabel("The current pokemon" , pokemonIcon, JLabel.CENTER);
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonLabel, 0, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.EAST, pokemonLabel, 20, SpringLayout.EAST, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokemonLabel, 32, SpringLayout.SOUTH, updateButton);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 23, SpringLayout.WEST, this);
	
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GREEN);
		this.setPreferredSize(new Dimension(900, 600));
		this.add(healthLabel);
		this.add(combatLabel);
		this.add(numberLabel);
		this.add(speedLabel);
		this.add(nameLabel);
		this.add(nameField);
		this.add(pokemonLabel);
		this.add(updateButton);
		this.add(numberField);
		this.add(advancedArea);
		this.add(advancedLabel);
		this.add(healthField);
		this.add(pokedexSelector);
		this.add(combatField);
		this.add(speedField);
		
		
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, nameField, -66, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 566, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, 4, SpringLayout.SOUTH, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, -72, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 57, SpringLayout.SOUTH, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, 5, SpringLayout.SOUTH, combatField);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 587, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberField, -11, SpringLayout.NORTH, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, -70, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 14, SpringLayout.SOUTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.EAST, advancedArea, -101, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, 494, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedArea, -187, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedArea, 11, SpringLayout.SOUTH, advancedLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedLabel, -337, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, advancedLabel, -180, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, combatField, 10, SpringLayout.EAST, combatLabel);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, 271, SpringLayout.EAST, combatLabel);
		baseLayout.putConstraint(SpringLayout.EAST, combatLabel, -341, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 135, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, healthLabel, -14, SpringLayout.WEST, healthField);
		baseLayout.putConstraint(SpringLayout.SOUTH, healthLabel, -15, SpringLayout.NORTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.EAST, speedField, 283, SpringLayout.EAST, speedLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedLabel, 469, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, speedField, 14, SpringLayout.EAST, speedLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 13, SpringLayout.SOUTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 24, SpringLayout.SOUTH, nameField);
		baseLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, nameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, numberLabel, 114, SpringLayout.WEST, nameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, -6, SpringLayout.NORTH, nameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, nameLabel, 21, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, -396, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, updateButton, 132, SpringLayout.EAST, pokedexSelector);
	
	}
	
	private void setupListeners()
	{
		
	}

	
}
