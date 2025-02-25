package ArrayPrograms;

public class JAVAArrayProblem2 {

	public static void main(String[] args) {

		String s = "Ram and Hanuman ji";
		String x = "";
		
		char[] arr = s.toCharArray();
		
		for (char god : arr) {
			if(god != ' ') {
				x = x + god;
			}
		}
		System.out.println(x);
	}

}
