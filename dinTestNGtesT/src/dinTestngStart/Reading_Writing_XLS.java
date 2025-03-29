package dinTestngStart;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.Calendar;

import dinTestngStart.Xls_Reader;

import java.nio.file.attribute.*;
public class Reading_Writing_XLS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader xl_Reader=new Xls_Reader("C:\\Users\\Administrator\\Desktop\\vi.xlsx");
		boolean isExist=xl_Reader.isSheetExist("Registration");
		System.out.println(isExist);
		//xl_Reader.addSheet("vinfightswat");
		xl_Reader.removeSheet("vinfightswat");
		xl_Reader.addColumn("Registration", "dota");
	//xl_Reader.removeColumn("Registration",0);  //here second argument sprcify column no starting from 0
		String str=xl_Reader.getCellData("Registration",4,3);
		System.out.println(str);
		//System.out.println(str);
		
		
		//xl_Reader.setCellData("Selenium", "Message", 4, "3riInfo");
		
	}

}
