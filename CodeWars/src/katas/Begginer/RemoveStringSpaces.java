package katas.Begginer;

public class RemoveStringSpaces {
	public static String noSpace(final String x) {

		String array[] = x.split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
		}

		return sb.toString();
		
//		Other Solutions
//		return x.replace(" ", "");
//		return x.replaceAll(" ","");//simple solution, but not effective on large strings
//		return x.replaceAll("\\s+","");
	}

	public static void main(String[] args) {
		System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
		System.out.println(noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
		System.out.println(noSpace("8aaaaa dddd r     "));
		System.out.println(noSpace("jfBm  gk lf8hg  88lbe8 "));
		System.out.println(noSpace("8j aam"));

	}

}
