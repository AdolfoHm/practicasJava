package katas.Begginer;

public class VowelCount {
	public static int getCount(String str) {
	    int vowelsCount = 0;
	    
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowelsCount++;
			}
		}
	    
	    return vowelsCount;
	    
//	    str.replaceAll("(?i)[^aeiou]", "").length();
	    
//	    int vowelsCount = 0;
//	    for(char c : str.toCharArray())
//	      vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
//	    return vowelsCount;
	    
//	    return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
	    
//	    int vowelsCount = 0;
//	    for(int i = 0; i < str.length(); i++) {
//	        switch(str.charAt(i)) {
//	        case 'a':
//	        case 'e':
//	        case 'i':
//	        case 'o':
//	        case 'u':
//	            vowelsCount++;
//	        }
//	    }
//	    return vowelsCount;
	    
	  }

	public static void main(String[] args) {
		
		System.out.println(getCount("abracadabra"));
		System.out.println(getCount("Mi mama me mima"));
		System.out.println(getCount("fgjklfhkfk"));

	}

}
