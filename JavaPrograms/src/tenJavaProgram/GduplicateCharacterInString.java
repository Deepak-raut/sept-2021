package tenJavaProgram;

public class GduplicateCharacterInString {

	public static void main(String[] args) {
		
		String s="dee paekkk ll";
		char a[]=s.toCharArray();
		int l=s.length();
		int count;
		int b;
		
		for(int i=0;i<l;i++)
		{  
			b=0;
			count=1;
			for(int j=i+1;j<l;j++)
			 {
				if(a[i]==a[j] && a[i]!=' ')
				{
					count++;
					b=1;
					a[j]=' ';	
				}
			 }
			
//			if(b==1)
//			{
//				System.out.print(a[i]);
//			}
//			
//			if(count>1)
//			{
//				System.out.println(" "+count);
//				
//			}
			
			
			
			
			//to remove duplicate characters
			
			if(b==0 && a[i]!=' ')
			{    
		    	System.out.print(a[i]);
			}	
			
	      
		}
}	
}

	
		
	
 
