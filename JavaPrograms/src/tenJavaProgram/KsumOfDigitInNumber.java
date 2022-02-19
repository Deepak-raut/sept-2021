package tenJavaProgram;

public class KsumOfDigitInNumber {

	public static void main(String[] args) {
		
		// How to find the sum of all digits of a number in java?
		
		int n=12345;
		
		int temp=n;
		
		int sum=0;
		
		int rem;
		
		while(temp>0)
		{
			rem=temp%10;
			
			sum=sum+rem;
			
			temp=temp/10;
		}
       System.out.println(sum);
       
      
		
	}

}
