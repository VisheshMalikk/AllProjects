package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {

		FileWriter writer = new FileWriter("C:\\Users\\Vishesh.1.Malik\\Downloads\\WriteFile.txt");

		BufferedWriter bfWriter = new BufferedWriter(writer);

		bfWriter.write("Vishesh Malik");
		bfWriter.newLine();
		bfWriter.write("Address : Noida, Uttar Pradesh");
		bfWriter.close();

	}

}
