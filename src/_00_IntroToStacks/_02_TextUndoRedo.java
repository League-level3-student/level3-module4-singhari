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


	JLabel l;
	Stack<Character> history;
	
	public static void main(String[] args){
		//Static v. Nonstatic problems, need to resolve, only l needs to be nonstatic no?
		 JFrame f = new JFrame();
		 JPanel p = new JPanel();
		 l = new JLabel();
		 //how do I resolve this.
		 history = new Stack<Character>();
		//Basically: The stack acts as a key saver. 
		//The JLabel should contain all the stuff. The stack should keep all the old stuff typed.
		f.add(p);
		f.setVisible(true);
		//worst part of Java Swing, setting it to visible
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() ==  KeyEvent.VK_BACK_SPACE) {
			//delete
		}
		else if(e.getKeyCode() == KeyEvent.VK_SHIFT) {
			//undo WAIT NO I CANT DO SHIFT BRUH
			//For now I'll use shift, I'll fix it soon.
			//god that looks horrible
			history.push(l.getText().charAt(l.getText().length()-1));
			l.setText(l.getText().substring(0,l.getText().length()-1));
			//THAT'S SCUFFED AS HELL
			//l looks like 1 in this font
			
		}
//		else if(e.getKeyCode() == KeyEvent.VK_ALPHANUMERIC) {
//			//letters to be added to the text
//		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//Useless rn? idk
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//or do I use this?????? i think I use this?
		l.setText(l.getText()+e.getKeyChar());
		//Haha now it keeps the old stuff AND adds the new character
		//(e.getKeyChar());
	}
}
