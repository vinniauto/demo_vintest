package Com.AbstractionDemo.selenium.test1;

public class TestBank {
	public static void main (String [] args){
		/*HDFCBank hb= new HDFCBank();//vintesdelbefore2slash
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		hb.getCountry();*/
		Bank b = new HDFCBank();
		b.credit();
		b.debit();
		b.loan();
				}

}


/* for this example of Abstraction class i have created main class as Test bank having main method to use as Run
 * as application .Abstract class for this is Bank.java where abstraction method are written without implementation
 *  now 
 * class like HDFC bank will extend to abstract class and inside hdfcbank class method can be override
 * 1> We can not create an object inside abstract class see opening commented ob1 line in future
 * if i make Bank class as public then ob1 will be ok try all this
 * 2>Abstract class can have abstract and non abstract method , public also before abstract can be removed
 * 3>Abstract class can have constructor along with Abstract method
 * 4>Abstract class can have final method
 * */

