package Basic3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {
	public static void main(String[] args) throws IOException {
		//Connecting streams
		
		File f = new File("C:\\JAVA\\Filewriting\\mytextfile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		
		String line = null;
		while((line = reader.readLine())!=null) {
			System.out.println(line);
		}

		reader.close();
		
	}
}
