package tenJavaProgram;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LlinesInStringParagraph {

	public static void main(String[] args) throws IOException {
		
		// Count Number of Lines in a String paragraph?
		
		//File file=new File("C:\\Users\\12LPA\\eclipse-workspace\\JavaPrograms\\src\\StringParagraph.txt");
		
		
			FileReader fr=new FileReader("C:\\Users\\12LPA\\eclipse-workspace\\JavaPrograms\\src\\StringParagraph.txt");
			
			LineNumberReader lnr=new LineNumberReader(fr);
			
			int number=0;
			while(lnr.readLine()!=null)
			{
				number++;
			}
			
			System.out.println(number);
			
			lnr.close();
		
	

	}

}
