package os.jr.impl;
import javax.swing.JFrame;

import os.jr.game.RSGame;
import os.jr.hooks.Hooks;

@SuppressWarnings("serial")
public class ReflectionClient extends JFrame {

	public ReflectionClient() {
		
		//Pixel perfect gamesize for this JFrame.
		setSize(781, 542);
		
		//Otherwise osrs would run in background after you closed it.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	//1. Declare a new OS-JR RSGame.
	public static RSGame rsGame = new RSGame();

	public static void main(String[] args) {

		//2. Declare a new instance of this class.
		ReflectionClient reflectionClient = new ReflectionClient();
		
		//3. Update gamepack and initializes applet.
		rsGame.run();
		
		reflectionClient.addApplet();
		
		//6. Access the Hookcache (Just one example)
		int[] i = Hooks.selector.client.getSkillExperiences();
	}

	private void addApplet() {
		
		//4. Add Reflection applet to the Container (such as JPanel or JFrame)
		add(RSGame.applet);
		
		//5. Set Client visible since OSRS is now in Container.
		setVisible(true);
	}

}
