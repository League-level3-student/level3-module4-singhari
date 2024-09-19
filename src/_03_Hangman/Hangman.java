package _03_Hangman;

import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class Hangman implements KeyListener{
	JFrame f;
	JPanel pan;
	JLabel wordHolder;
	String word;
	String messageInJLabel="";
	static int rounds;
	int lengthOfWord;
	int lives = 10;
	
	public static void main(String[] args) {
		//setUp();
		Stack<String> wordList = new Stack<String>();
		String s = JOptionPane.showInputDialog("Enter the number of words to guess (1-100");
		//getting number of rounds
		rounds = Integer.parseInt(s);
		//checking if rounds is in bounds
		if(!(rounds < 100 && rounds >= 1)) {
			rounds = 2;
		}
		for(int i = 0; i < rounds; i++) {
			String str = Utilities.readRandomLineFromFile("dictionary.txt");
			if(wordList.contains(str))
			{
				str = Utilities.readRandomLineFromFile("dictionary.txt");	
			}
			wordList.push(str);
			
		}
		
	}
	
	public void setUp() {
		for(int i = 0; i < word.length(); i++) {
			messageInJLabel+="_";
		}
		messageInJLabel+=" Lives: "+lives;
	}
	
	public void gameOver() {
		String message = " ";
		if(lives == 0) {
			message = "You ran out of lives. The word was "+ word;
		}
		else {
			message = "You won!";
		}
		//ask the user to play again
		
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//when user types smth
//		if((e.getKeyChar())) {
//			
//		}
		
		boolean letterWasPresent = false;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == e.getKeyChar()) {
				letterWasPresent = true;
			}
		}
		if(!letterWasPresent) {
			lives--;
			wordHolder.setText(messageInJLabel.subSequence(0, lengthOfWord)+" Lives: "+lives);
		}
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
