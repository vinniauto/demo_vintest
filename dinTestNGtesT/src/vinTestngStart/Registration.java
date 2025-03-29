package vinTestngStart;

import org.testng.annotations.DataProvider;
import vinTestngStart.Xls_Reader;

public class Registration {
	
	

	@DataProvider
	public Object[][] getData(){
	Xls_Reader d=new Xls_Reader("C:\\Users\\Administrator\\Desktop\\desktop material\\Mercury.xlsx");
	int rowcount=d.getRowCount("Registration");
	int columncount=d.getColumnCount("Registration");	
	
	Object[][] data=new Object[(rowcount-1)][columncount];
	for(int i=0;i<(rowcount-1);i++){
		int x=i+2;
		for (int j=0;j<columncount;j++){
	data[i][j]=d.getCellData("Registration", j, x);
	}
	
	}
	return data;
}
}

	
