package tenJavaProgram;

public class JfactorialOfNumber {

	public static void main(String[] args) {
		// factorial of number
		
		int n=5;
		
		int fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);

	}

}
