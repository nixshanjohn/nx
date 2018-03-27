import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


public class NumberFormaClass3 {
	
	public static void main(String[]args) {
		double decimal = 677.27467;
		System.out.println("The test number :" + decimal);
		
		
	DecimalFormat currFormat = new DecimalFormat("$ 00.##");
	String number = currFormat.format(decimal);
	System.out.println(number);
	
	
	NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.JAPAN);
	System.out.println(formatter.format(343.33));
	
			
			
			
	
  }		

}
