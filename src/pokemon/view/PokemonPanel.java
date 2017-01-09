package pokemon.view;

import javax.swing.*;
import pokemon.controller.PokemonController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

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
		this.pokedexSelector = new JComboBox(new String [] {"Scyther", "Treeko", "Munchlax", "Golette", "Trapinch"});
		this.pokemonLabel = new JLabel("The current pokemon" , pokemonIcon, JLabel.CENTER);
		
		
		setupPanel();
		setupLayout();
//		setupListeners();
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
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, -128, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 6, SpringLayout.SOUTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 155, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 85, SpringLayout.SOUTH, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonLabel, 35, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, pokemonLabel, -45, SpringLayout.WEST, combatLabel);
	}
	
	private void changeColorBasedOnData(String data)
	{
		if(data.contains("Normal"))
		{
			this.setBackground(Color.YELLOW);
		}
		else if (data.contains("Ground"))
		{
			this.setBackground(Color.CYAN);
		}
		
	
	
	
	
	
	
	
	
	
	
		repaint();
	}
	
	
	
//	private void setupListeners()
//	{
//		pokedexSelector.addActionListener(new ActionListener()
//		{
			
//		});
		
	
	
//		this.addMouseListener(new MouseListener()
//
//		{
//			public void mouseEntered(MouseEvent entered)
//			{
//			JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse entered the program");
//			}
//				
//			public void mouseReleased(MouseEvent released)
//			{
//				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse was released");
//
//			}
//			public void mouseExited(MouseEvent exited)
//			{
//				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse entered the exited");
//			}
//			
//			public void mouseClicked(MouseEvent clicked)
//			{
//				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse entered the clicked");
//			}
//		
//			public void mousePressed(MouseEvent pressed)
//			{
//				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse entered the pressed");
//			}
//		});
//		this.addMouseMotionListener(new MouseMotionListener()
//		{
//				public void mouseDragged(MouseEvent dragged)
//				{
//					setRandomColor();
//				}
//				
//				public void mouseMoved(MouseEvent moved)
//				{
//					if((Math.abs(moved.getX() - updateButton.getX()) < 5 ) || (Math.abs(moved.getY() - updateButton.getY()) < 5))
//					{
//						updateButton.setLocation(moved.getX() + 10, moved.getY() - 10);
//					}
//				}
//				
//			});
//	}
//
//	private void setRandomColor()
//	{
//		int red = (int) (Math.random() * 256);
//		int green = (int) (Math.random() * 256);
//		int blue = (int) (Math.random() * 256);
//		
//		this.setBackground(new Color(red, green,blue));
//	}
}
