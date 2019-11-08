package com;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
	    Object[] playerValues = { "1", "2", "3", "4" };
	    String playerInitialSelection = "1";
	    Object players = JOptionPane.showInputDialog(null, "Spieler:",
	        "Darts Game", JOptionPane.QUESTION_MESSAGE, null, playerValues,playerInitialSelection);
	    System.out.println(players);
		
	    Object[] gameValues = { "301", "501", "170" };
	    String initialSelection = "501";
	    Object gameMode = JOptionPane.showInputDialog(null, "Game Mode:",
	        "Darts Game", JOptionPane.QUESTION_MESSAGE, null, gameValues, initialSelection);
	    System.out.println(gameMode);
		
		String gameInfo;
		gameInfo = "Spieler: " + players + "\n" + "Modus: " + gameMode;
		
		JOptionPane.showMessageDialog(null, gameInfo);
		
		System.out.println("hi gitfl00gg045566666");

	}
}
