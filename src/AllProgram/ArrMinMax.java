package AllProgram;

public class ArrMinMax {

public static void main(String[] args) {
	
	int arr[]= {510,65,45,63,70,80000};
	int maxx=arr[0];
	int minn=arr[0];
	
	for(int array:arr)
	{
		if(array>maxx)
		{
			
			maxx=array;
		}
		if(array<minn)
		{
			minn=array;
		}
		
	}
	System.out.println(maxx);
	System.err.println(minn);
	
}
}
