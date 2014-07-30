package lightleaf.panel.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;
 
public class InboxPanel extends JPanel { 
  public void paintComponent(Graphics g){
	  g.setColor(Color.GREEN);
	  g.fillRect(0, 0, this.getWidth(), this.getHeight());
  }     
}