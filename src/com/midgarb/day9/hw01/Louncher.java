package com.midgarb.day9.hw01;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;





public class Louncher {
public Louncher(){
	JFrame frame1 = new JFrame("You lose");
	frame1.setLocation( 250,  250);
	frame1.setMinimumSize(new Dimension(250, 150));
	frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	JPanel jp = new JPanel();
	frame1.getContentPane().add(jp);
	frame1.pack();
	frame1.setVisible(true);
	
	jp.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();

	c.gridx = 0;
	c.gridy = 0;
	c.gridwidth = 2;
	JLabel jla = new JLabel("Would you try again???");
	jp.add(jla, c);
	JButton jb = new JButton("OK");
	

	c.gridwidth = 1;
	c.gridx = 0;
	c.gridy = 1;
	jp.add(jb, c);
	JButton jb1 = new JButton("Cancel");
	
//	c.gridwidth = 1;
	c.gridx = 1;
	c.gridy = 1;
	jp.add(jb1, c);

}
public static void main(String[] args) {
	Louncher g = new Louncher(); 
	
}
}
