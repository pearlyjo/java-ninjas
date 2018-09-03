
package CoreJavaDay3;
import java.awt.color.*;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

 class Colors extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//draw the face
		g.setColor(Color.yellow);
		g.fillOval(10, 10, 200, 200);
		//draw the eyes
		g.setColor(Color.black);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135,65, 30, 30);
	
		//draw the mouth
		
		g.fillOval(50,110,120,60);
		
		
	}
	
}

