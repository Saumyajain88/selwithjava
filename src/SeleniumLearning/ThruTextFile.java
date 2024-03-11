package SeleniumLearning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class ThruTextFile {
	
	@Test
	public class thruTextFile {
		File fc;
		FileWriter fw;
		BufferedWriter bw;
		FileReader fr;
		BufferedReader br;
		String src="C:\\Users\\umang\\Desktop\\SAUMYA\\Quality Assurance\\Selenium Practice\\data.txt";
		
		@Test
		public void thruTextFile() throws IOException
		{
			fc=new File(src);
			fc.createNewFile();
			
			
		}
	}
	
}
