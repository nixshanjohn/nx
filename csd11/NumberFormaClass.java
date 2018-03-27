import java.math.BigDecimal;

public class NumberFormaClass {
	
	public static void main(String[]args) {
		double decimal = 7.27467;
		System.out.println("The test number :" + decimal);
		
			
	    int decimalPlaces = 2;// the scale for the decimal
		
		// use of BigDecimal class
		BigDecimal bd = new BigDecimal(decimal);
		
		// set the scale and round up if >= 0.5
		bd = bd.setScale(decimalPlaces,BigDecimal.ROUND_HALF_EVEN);
		double bigDecimal = bd. doubleValue();
		System.out.println("BigDecimal rounded in 3rd decimal:"+ bigDecimal);
		
		
		
	}

}
