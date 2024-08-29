package _00_IntroToStacks;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		// 1. Create a Stack of Doubles
		//    Don't forget to import the Stack class
		Stack<Double> s = new Stack<Double>();
		// 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random ran = new Random();
		int max = 100;
		for(int i = 0; i <max; i++) {
			s.push(ran.nextDouble()*max);
		}
		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String s1 = JOptionPane.showInputDialog("Pick a number");
		String s2 = JOptionPane.showInputDialog("Pick another number");
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		ArrayList<Double> check = new ArrayList<Double>();
		for(int i =0; i < max; i++) {
			double value = s.pop();
			check.add(value);
			if(value <= Math.max(num1, num2) && value >= Math.min(num1, num2)) {
				System.out.println(value);
			}
		}
//		System.out.println(check.size());
//		System.out.println(s.size());
		// 4. Pop all the elements off of the Stack. Every time a double is popped that is
		//    between the two numbers entered by the user, print it to the screen.


		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}
