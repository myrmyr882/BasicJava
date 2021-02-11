package Basic3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
	public static void main(String[] args) throws IOException {
		//stream connectivity
		
		File f= new File("C:\\JAVA\\Filewriting\\mytextfile.html");
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter writer = new BufferedWriter(fw);
		
		/*//writing inside file
		writer.newLine();
		writer.write("starting second line");
		writer.newLine();
		writer.write(2 + "nd time writing a file");
		writer.newLine();
		writer.write("Streams - & learning");
		*/
		
		writer.write("<html><body><title>Way 2 automation</title><h1>Learning java from yeshwanth</h1></body></html>");
		System.out.println("file created");
		writer.close();
	}
}
