package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingTextFile {

	public static void main(String[] args) {
		File f = new File("resources/Information.txt");
		
		Scanner sc = null;
		try {
			sc = new Scanner(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		
		
	}

}
