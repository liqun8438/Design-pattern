import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	
	public MyFrame()
	{
		
		
		MyPanel p=new MyPanel();
		getContentPane().add(p);
		setSize(500,300);
		this.setVisible(true);
		
	}



}
