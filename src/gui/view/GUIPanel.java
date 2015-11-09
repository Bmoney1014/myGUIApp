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
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		firstButton = new JButton("Please do not click the button");
		firstField = new JTextField("words can be typed here");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPanel()
	{
		
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		
	}
	
}
