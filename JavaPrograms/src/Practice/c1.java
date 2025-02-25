package Practice;

public class c1 {
	
	public static void main(String[] args) {
		
		String line = "i love my india";

		String[] splittedLineIntoArray = line.split(" ");

		String capitalizeLine = "";

		for (int i = 0; i < splittedLineIntoArray.length; i++) {
			char firstChar = Character.toUpperCase(splittedLineIntoArray[i].charAt(0));
			capitalizeLine = capitalizeLine + " " + firstChar + splittedLineIntoArray[i].substring(1);
		}
		System.out.println(capitalizeLine.trim());
		
	}
	

}
