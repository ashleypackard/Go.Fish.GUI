/* Created by: Ashley Packard & Mike Kucharski
 * Fall 2012 | COMP 285 - OOPS in Java
 */

package go.fish.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

@SuppressWarnings("serial")
public class GUIGameRules extends JFrame 
{
	private JTextArea taRules;
	private JScrollPane scrollRules;
	private Color blue, white;
	private JLabel rulesLabel;
	private String rulesText;
		
	public GUIGameRules()
	{
		// Colors
		blue = new Color(0, 162, 255);
		white = new Color(255, 255, 255);
		
		// frame properties
		setSize(402, 263);
		setTitle("Game Rules");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
				
		getContentPane().setLayout(null);
		getContentPane().setBackground(blue);
		
		// Create components
		rulesLabel = new JLabel("Game Rules:");
		rulesLabel.setBounds(10, 11, 212, 75);
		rulesLabel.setFont(new Font("Rockwell", Font.BOLD, 30));
		rulesLabel.setForeground(white);

		rulesText = "     Seven cards are dealt to each player and for each pair a player has, " +
				"their score is incremented by one. On your turn you are able to ask one other " +
				"player if they have a matching card to one in your hand. If the player asked does " +
				"indeed have the card they must relenquish it to you. The pair is then removed and added " +
				"to your total score. You may then inquire, to the same player or to a different player, " +
				"if they have another card you need to make a pair. This continues until you are " +
				"told 'Go Fish!' You then draw a card from the deck and moving clockwise, it's the next " +
						"player's turn. This sequence continues unill all pairs have been played.The player with " +
						"the most pairs at the end of the game wins!";

// For more experienced people get this to work :D		
//		try {
//			Scanner fin = new Scanner(new File("res/txtFiles/gameRules.txt"));
//			while (fin.hasNextLine()) {rulesText += fin.nextLine();}
//			fin.close();
//		} 
//		catch (FileNotFoundException e) {
//			System.out.println("Error: Could not find the file!");
//		}


		// Add components
		getContentPane().add(rulesLabel);
		
		taRules = new JTextArea();
		taRules.setWrapStyleWord(true);
		taRules.setLineWrap(true);
		taRules.setEditable(false);
		taRules.setMargin(new Insets(5,10,10,10));
		taRules.setText(rulesText);
		taRules.setCaretPosition(taRules.getDocument().getLength()/5);
		
		scrollRules = new JScrollPane(taRules);
		scrollRules.setBounds(10, 72, 376, 152);
		scrollRules.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scrollRules);
		        
	}
	

	
}
