package _00_IntroToStacks;

import java.util.*;
import java.awt.event.*;

import javax.swing.*;

public class _02_TextUndoRedo implements KeyListener{
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should
	 * look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last
	 * character is erased from the JLabel.
	 * 
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is
	 * pressed, the top Character is popped  off the Stack and added back to
	 * the JLabel.
	 */
	public static void main(String[] args){

		JFrame f = new JFrame();
		JPanel p = new JPanel();
		JLabel l = new JLabel();
		Stack<Character> history = new Stack<Character>();
		//Basically: The stack acts as a key saver. 
		//The JLabel should contain all the stuff. The stack should keep all the old stuff typed.
		f.add(p);
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() ==  KeyEvent.VK_BACK_SPACE) {
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
