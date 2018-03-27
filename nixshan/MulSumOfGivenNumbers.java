class MulSumOfGivenNumbers{
	public static void main(String args[]){
	int sum= 0;
	int mul= 1;
	
	 for (int num=1; num<=10; num++){
		 
		 sum = sum + num;
		 mul = mul * num;
	 }
	 
	 System.out.println("Sum of numbers = " + sum);
	 System.out.println("Mul of numbers = " + mul);
	}
	}
