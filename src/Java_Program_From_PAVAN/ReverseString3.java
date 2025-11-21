package Java_Program_From_PAVAN;

public class ReverseString3 {

	public static void main(String[] args) {
		
		String str="hello";
		StringBuilder sb=new StringBuilder(str);
		String rev=sb.reverse().toString();
		System.out.println(rev);
	}
}
