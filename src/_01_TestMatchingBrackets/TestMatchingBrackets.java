package _01_TestMatchingBrackets;

import java.util.*;

public class TestMatchingBrackets {
    /*
     * Use a Stack to complete the method for checking if every opening bracket
     * has a matching closing bracket
     */
    public static boolean doBracketsMatch(String b) {
    	Stack<Integer> count = new Stack<Integer>();     	
    	int added =0;
    	for(int i =0; i< b.length(); i++) {
    		if(b.charAt(i) == '{') {
    			added = 0;
    		}
    		else {
    			added = 1;
    		}
    		count.push(added);
    	}
    	int max = count.size();
    	int countOnes = 0;
    	int countZeros = 0;
    	for(int i =0; i < max; i++) {
    		if(count.pop() == 1) {
    			countOnes++;
    		}
    		else {
    			countZeros++;
    		}
    	}
    	
        return countOnes == countZeros;
    }
}