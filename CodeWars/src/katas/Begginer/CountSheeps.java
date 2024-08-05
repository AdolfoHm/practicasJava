package katas.Begginer;

import java.util.Arrays;
import java.util.Collections;

public class CountSheeps {
	public static int countSheeps(Boolean[] arrayOfSheeps) {
		
		int contador = 0;
		for(int i = 0; i < arrayOfSheeps.length; i++) {
			if (arrayOfSheeps[i] != null && arrayOfSheeps[i] == true) {
				contador++;
			}
		}
		
		return contador;
		
//		int counter = 0;
//	    for (Boolean present : arrayOfSheeps) {
//	      if (present != null && present) {
//	        counter += 1;
//	      }
//	    }
//	    return counter;
		
//		return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
		
//		return Arrays.stream(arrayOfSheeps).filter(x -> x != null).filter(x -> x == true).toArray().length;

	  }

	public static void main(String[] args) {
		
		Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, null, true,  true };
		
		System.out.println(countSheeps(array1));

	}

}
