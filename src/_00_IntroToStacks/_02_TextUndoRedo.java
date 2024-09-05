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
	JFrame f;
	JPanel p;
	JLabel l;
	Stack<Character> history;
	
//	public _02_TextUndoRedo(){
//		
//	}
	public void startup() {
		f = new JFrame();
		p = new JPanel();
		l = new JLabel();
		history = new Stack<Character>();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.addKeyListener(this);
		p.add(l);
		f.add(p);
		f.setSize(400,200);
		f.setVisible(true);

	}

	public static void main(String[] args){
		//Static v. Nonstatic problems, need to resolve, only l needs to be nonstatic no?

		// l = new JLabel();
		//how do I resolve this.
		//		 history = new Stack<Character>();
		//Basically: The stack acts as a key saver. 
		//The JLabel should contain all the stuff. The stack should keep all the old stuff typed.
		//p.add(l);
		//		f.add(p);
		//		f.setVisible(true);
		//worst part of Java Swing, setting it to visible
		_02_TextUndoRedo b = new _02_TextUndoRedo();
		 b.startup();

	}



	@Override
	public void keyPressed(KeyEvent e) {
		//	p.remove(l);
		// TODO Auto-generated method stub
//		if(e.getKeyCode() ==  KeyEvent.VK_BACK_SPACE) {
//			//delete
//			history.push(l.getText().charAt(l.getText().length()-1));
//			l.setText(l.getText().substring(0,l.getText().length()-1));
//		}
//		else if(e.getKeyCode() == KeyEvent.VK_ENTER) {
//			//undo WAIT NO I CANT DO SHIFT BRUH
//			//ig enter works
//			//For now I'll use shift, I'll fix it soon.
//			//god that looks horrible
//
//			//THAT'S SCUFFED AS HELL
//			//l looks like 1 in this font
//			//only at home
//			l.setText(l.getText()+history.pop());

		}
		//		else if(e.getKeyCode() == KeyEvent.VK_ALPHANUMERIC) {
		//			//letters to be added to the text
		//		}
		//	p.add(l);
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//Useless rn? idk
		//p.repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//or do I use this?????? i think I use this?
		//p.remove(l);
		System.out.println(e.getExtendedKeyCode());
		if(e.getExtendedKeyCode() ==  KeyEvent.VK_BACK_SPACE) {
			//delete
			System.out.println("anything");
			history.push(l.getText().charAt(l.getText().length()-1));
			l.setText(l.getText().substring(0,l.getText().length()-2));
		}
		else if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			//undo WAIT NO I CANT DO SHIFT BRUH
			//ig enter works
			//For now I'll use shift, I'll fix it soon.
			//god that looks horrible

			//THAT'S SCUFFED AS HELL
			//l looks like 1 in this font
			//only at home
			l.setText(l.getText()+history.pop());
		}
		//can be made better
		else {
			l.setText(l.getText()+e.getKeyChar());
		}
		//p.add(l);
	//	p.repaint();
	//	f.setSize(400,200);
		//Haha now it keeps the old stuff AND adds the new character
		//(e.getKeyChar());
	}
}
