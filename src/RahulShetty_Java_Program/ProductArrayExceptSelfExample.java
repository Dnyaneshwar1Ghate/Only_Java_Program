package RahulShetty_Java_Program;

public class ProductArrayExceptSelfExample {
	
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4};
		int a1=arr1.length;
		
		int [] leftProduct=new int[a1];
		int[] rightProduct=new int[a1];
		
		
		int[] outputProduct=new int[a1];
		leftProduct[0]=1;
		rightProduct[a1-1]=1;
		
		
		for(int i=1;i<a1;i++)
		{
			leftProduct[i]=arr1[i-1]*leftProduct[i-1];
			
		}
		for(int i=a1-2;i>=	0;i--)
		{
			rightProduct[i] = arr1[i+1] * rightProduct[i+1];
			
		}
		for(int i=0;i<a1;i++)
		{
			outputProduct[i]=leftProduct[i]*rightProduct[i];
			
		}
		for(int i=0;i<a1;i++)
		{
			System.out.print(outputProduct[i]+" ");
			
		}
	}

}
