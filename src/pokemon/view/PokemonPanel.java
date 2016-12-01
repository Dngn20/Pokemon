package pokemon.view;

import javax.swing.*;
import pokemon.controller.PokemonController;
import java.awt.Color;
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
		this.pokemonIcon = new ImageIcon(getClass().getResource(""));
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
		this.pokedexSelector = new JComboBox(new String [] {"Sceptile, Scizor, Espeon , Golurk, Flygon"});
		this.pokemonLabel = new JLabel("The current pokemon" , pokemonIcon, JLabel.CENTER);
	
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.BLACK);
		this.add(healthLabel);
		this.add(combatLabel);
		this.add(numberLabel);
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

	
}
