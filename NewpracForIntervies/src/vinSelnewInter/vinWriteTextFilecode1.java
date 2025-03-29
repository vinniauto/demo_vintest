package vinSelnewInter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class vinWriteTextFilecode1 {

	public static void main(String[] args) {
		
	try{
		File file = new File("mayank.txt");
		if (!file.exists()){
			file.createNewFile();
		}
	@SuppressWarnings("resource")
	//FileWriter fw =new FileWriter(file);
	PrintWriter pw = new PrintWriter(file);
	pw.println("My name is vinesh");
	pw.println(10000);
	pw.println("@vin0345 my name is ganesh");
	pw.close();
	}
   catch(IOException e){
	   e.printStackTrace();
	   
   }
	}

}
