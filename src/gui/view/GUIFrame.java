package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIAppController;
/**
 * 
 * @author bhos1889
 * @version 0.x November 9, 2015
 */
public class GUIFrame extends JFrame
{
	private GUIAppController baseController;
	private GUIAppPanel basePanel;
	
	public GUIFrame(GUIAppController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIAppPanel(baseController);
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); //Must be first line of setupFrame  - Installs the panel in the frame
		this.setSize(400, 400); //Find a good size for the application
		this.setResizable(false); //Advisable not required
		this.setVisible(true); //Must be last line of code
	}
	
	public GUIAppController getBaseController()
	{
		return baseController;
	}
	
}
