package katas.Begginer;

public class FindNeedle {
	
	public static String findNeedle(Object[] haystack) {
		
		String str = "";
		
		for (int i = 0; i < haystack.length; i++) {
			if (haystack[i] != null && haystack[i].equals("needle")) {
				str = "found the needle at position " + i;
			}
		}
		
		return str;
		
//		Other Solutions
		
//		return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
		
//		return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
		
//		for (int i = 0; i < haystack.length; i++) {
//            if (haystack[i] == "needle") {
//                return "found the needle at position " + i;
//            }
//        }
//        return "needle be lost, yo";
		
//		int i = 0;
//		for (; i < haystack.length; i++) {
//			if (haystack[i] == "needle") {
//				break;
//			}
//		}
//		return "found the needle at position " + i;
		
//		int index = 0 ; 
//	     for (Object el : haystack){
//	       
//	        if(el instanceof String && el.equals("needle")){
//	          break; 
//	        }
//	        index++;
//	     }
//	   return new String ("found the needle at position " + index ) ;
		
	  }

	public static void main(String[] args) {
		Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
		System.out.println(findNeedle(haystack1));

	}

}
