package Date_05_03_2026;

public class FindSecond {

	
	public static void main(String[] args) {
		int arr[]={1,4,5,8,7,9,6,5,3,4};
		int max=0;
		int second=0;
		for(int m:arr)
		{
			if(max<m)
			{
				max=m;
			}
		}
		System.out.println(max);
		for(int sl:arr)
		{
			if(sl>second && sl<max)
			{
				second=sl;
			}
			
		}
			
		System.out.println(second);
		
	}
}
