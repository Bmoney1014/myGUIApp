package gui.view;

import javax.swing.*;

import gui.controller.GUIController;
/**
 * 
 * @author bhos1889
 * @version 0.x November 9, 2015
 */
public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstField;
	private SpringLayout baseLayot;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("Please do not click the button");
		firstField = new JTextField("words can be typed here");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Helper method to load all GUI components into the panel
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstField);
	}
	private void setupLayout()
	{
		baseLayout.putConstrant(SpringLayout.WEST, firstButton, 107, SpringLayout.WEST, this);
		baseLayout.putConstrant(SpringLayout.SOUTH, firstButton, -32, SpringLayout.SOUTH, this);
		baseLayout.putConstrant(SpringLayout.WEST, firstField, 37, SpringLayout.WEST, this);
		baseLayout.putConstrant(SpringLayout.WEST, firstField, -24, SpringLayout.SOUTH, this);
	}
	private void setupListeners()
	{
		
	}
	
}
