package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadToFile {

	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("C:\\Users\\Vishesh.1.Malik\\Downloads\\ReadFile.txt");
		BufferedReader bfReader = new BufferedReader(reader);
		String data;
		while ((data = bfReader.readLine()) != null) {
			System.out.println(data);
		}
		bfReader.close();
	}
}
