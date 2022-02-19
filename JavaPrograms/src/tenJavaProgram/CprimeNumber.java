package tenJavaProgram;

public class CprimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int n=87;
		
		int rem;
		int b=0;
		
		for(int i=2;i<n/2;i++)
		{
			rem=n%i;
			
			if(rem==0)
			{
				System.out.println(n+" "+"is not prime number");
				b=1;
				break;
			}
				
		}
		
		if(b==0)
		{
			System.out.println(n+" "+"is  prime number");
		}
	}

}
