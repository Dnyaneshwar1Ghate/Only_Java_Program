package ArrayDemo;

public class Second {

	public static void main(String[] args) {
		
		int arr[]= {45,5,87,98,45,78,54,65};
		int larg=arr[0];
		int second=arr[0];
		for(int array:arr)
		{
			if(array<larg)
			{
				larg=array;
			}
			
		}for(int array:arr)
		{
			if(second<array && larg>array)
			{
				second=array;
			}
			
			
		}
		System.out.println(larg);
		System.out.println(second);
	}
}
