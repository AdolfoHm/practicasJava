package katas.Novice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.logging.Logger;

public class ScoringWord {
	private static final Logger LOGGER = Logger.getLogger(ScoringWord.class.getName());
	
	public static String high(String str) {
		
//		String highestScore = "";
//		int maxSum = 0;
//		int sum = 0;
//		
//		HashMap<Character, Integer> letters =  new HashMap<Character, Integer>();
//		letters.put('a', 1);
//		letters.put('b', 2);
//		letters.put('c', 3);
//		letters.put('d', 4);
//		letters.put('e', 5);
//		letters.put('f', 6);
//		letters.put('g', 7);
//		letters.put('h', 8);
//		letters.put('i', 9);
//		letters.put('j', 10);
//		letters.put('k', 11);
//		letters.put('l', 12);
//		letters.put('m', 13);
//		letters.put('n', 14);
//		letters.put('o', 15);
//		letters.put('p', 16);
//		letters.put('q', 17);
//		letters.put('r', 18);
//		letters.put('s', 19);
//		letters.put('t', 21);
//		letters.put('u', 21);
//		letters.put('v', 22);
//		letters.put('w', 23);
//		letters.put('x', 24);
//		letters.put('y', 25);
//		letters.put('z', 26);
//		
//		String[] array = str.split(" ");
//		
//		for (int countA = 0; countA < array.length; countA++) {
//			for (int countL = 0; countL < array[countA].length(); countL++) {
//
//				for (char clave : letters.keySet()) {
//					if (array[countA].charAt(countL) == clave) {
//						int value = letters.get(clave);
//						sum = sum + value;
//						break;
//					}
//					;
//				}
//			}
//			
//			LOGGER.info("palabra:" + array[countA] + " sum:" + sum + " maxsum:" + maxSum);
//
//			if (sum > maxSum) {
//				highestScore = array[countA];
//				maxSum = sum;
//			}
//			sum = 0;
//
//		}
//
//	    return highestScore;
	    
	    
	    return Arrays.stream(str.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get();
	  }

	public static void main(String[] args) {
		System.out.println(high("aaaaaa zz"));
		System.out.println(high("man i need a taxi up to ubud"));
		System.out.println(high("what time are we climbing up to the volcano"));
		System.out.println(high("take me to semynak"));
		System.out.println(high("ybiflwwazzmmhcjss kwomzdlpixvzg"));
		 
	}

}
