package Basic;

public class CountNumberInArray {

	public static void main(String[] args) {
		
		int num[]= {4,5,6,8,9,7,5};
		int target=4;
		int count =0;
		for(int n:num)
		{
			if(n==target)
			{
				count++;
			}
		}
		
		
		System.out.println(target+" fount at "+count + " position ");
		
	}
}
