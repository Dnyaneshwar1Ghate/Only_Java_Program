package AllProgram;

public class ArrayWithCont {
	
	public static void main(String[] args) {
		
		int arr[]= {323,45,56,34,4};
		
		int max_Pos=0;
		int min_Pos=0;
		
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				max_Pos=i;
			}
			if(arr[i]<min)
			{
				min=arr[i];
				min_Pos=i;
			}
		}
		System.out.println("max number is "+max +" with "+max_Pos+ " position");
		System.out.println("min number is "+min +" with "+min_Pos+ " position");
		
	}

}
