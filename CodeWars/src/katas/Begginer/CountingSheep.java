package katas.Begginer;

public class CountingSheep {
	public static String countingSheep(int num) {
	    
		StringBuffer sb = new StringBuffer(); 
		for (int i = 1; i <= num; i++) {
			sb.append( i + " sheep...");
		}
		
	    return sb.toString();
	    
	    
//	    Other Solutions
//	    
//	    StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 1; i <= num; i++) {
//            stringBuilder.append(i).append(" sheep...");
//        }
//        return stringBuilder.toString();
	    
	    
	  }

	public static void main(String[] args) {
		System.out.println(countingSheep(0));
		System.out.println(countingSheep(1));
		System.out.println(countingSheep(2));
		System.out.println(countingSheep(3));

	}

}
