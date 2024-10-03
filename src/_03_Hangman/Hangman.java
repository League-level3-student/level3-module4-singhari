package _03_Hangman;

import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class Hangman implements KeyListener{
	JFrame f = new JFrame();
	JPanel pan = new JPanel();
	JLabel wordHolder = new JLabel();
	String word;
	String messageInJLabel="";
	static int rounds;
	int lengthOfWord;
	int lives = 10;
	Stack<String> wordList = new Stack<String>();
	
	public static void main(String[] args) {
		Hangman h = new Hangman();
		h.startGame();
		
		
	}
	public void startGame() {
		String s = JOptionPane.showInputDialog("Enter the number of words to guess (1-100)");
		//getting number of rounds
		rounds = Integer.parseInt(s);
		//checking if rounds is in bounds
		if((rounds >= 100 || rounds < 1)) {
			rounds = 2;
		}
		for(int i = 0; i < rounds; i++) {
			String str = Utilities.readRandomLineFromFile("dictionary.txt");
			wordList.push(str);
			
		}
		for(int i = 0; i < rounds; i++) {
			if(wordList.size() == 0) {
				gameOver();
			}
			else {
			word = wordList.pop();
			setUp();
			}
		}
	}
	public void setUp() {
		
		for(int i = 0; i < word.length(); i++) {
			messageInJLabel+="_";
		}
		messageInJLabel+=" Lives: "+lives;
		wordHolder.setText(messageInJLabel);
		pan.add(wordHolder);
		f.add(pan);
		f.setVisible(true);
		f.pack();
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
		JOptionPane.showMessageDialog(pan, message);
		
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
			if(lives == 0) {
				gameOver();
			}
			else {
				wordHolder.setText(messageInJLabel.subSequence(0, lengthOfWord)+" Lives: "+lives);
			}
		}
		else {
			char[] s = messageInJLabel.toCharArray();
			for(int i = 0; i < word.length(); i++) {
				
				if(word.charAt(i) == e.getKeyChar()) {
					s[i] = e.getKeyChar();
				}
			}
			//messageInJLabel
			for(int i = 0; i < s.length; i++) {
				messageInJLabel+=s[i];
			}
			messageInJLabel = messageInJLabel.subSequence(0, lengthOfWord)+" Lives: "+lives;
			wordHolder.setText(messageInJLabel);
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
