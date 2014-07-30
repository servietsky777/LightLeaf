package lightleaf;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
 
public class MenuPanel extends JPanel { 
  public void paintComponent(Graphics g){
	  g.setColor(Color.decode("#009933")); 
	  g.fillRect(0, 0, this.getWidth(), this.getHeight());
  }     
  
}