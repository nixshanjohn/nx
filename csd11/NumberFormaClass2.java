import java.text.DecimalFormat;


public class NumberFormaClass2 {

	public static void main(String[]args) {
		double decimal = 677.27467;
		System.out.println("The test number :" + decimal);
		
		
	DecimalFormat currFormat = new DecimalFormat("$ 00.##");
	String number = currFormat.format(decimal);
	System.out.println(number);
	
  }		
}
