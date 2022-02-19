package tenJavaProgram;

public class DminMaxArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int A[]= {6,5,3,9,15,17};
		
		int b=A[0];
		int c=A[0];
		
		for(int i=1;i<A.length;i++)
		{
			if(b>A[i])
			{
				b=A[i];
			}
			if(c<A[i])
			{
				c=A[i];
			}
		}
		
		System.out.println("min number is"+" "+b);
		System.out.println("max number is"+" "+c);
	}

}
