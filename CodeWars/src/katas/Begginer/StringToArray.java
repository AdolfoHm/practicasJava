package katas.Begginer;

public class StringToArray {
	public static String[] stringToArray(String s) {
//		String [] array = s.split(" ");
//	    return array;
	    
	    return s.split(" ");
	    }

	public static void main(String[] args) {
		System.out.println(stringToArray("Robin Singh"));
		System.out.println(stringToArray("I love arrays they are my favorite"));

	}

}
