package Basic;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		int a=1111;
		int b=1111;
		int c=1111;
		if(a>b && a>c)
		{
			System.out.println("a is largest");
		}else if(b>a&&b>c)
		{
			System.out.println("b is largest");
		}
		else if(a==b && b==c && a==c){
			
			System.out.println("Number is equal");
			
		}else
		{
			System.out.println("c is largest");
		}
	}
	

}
