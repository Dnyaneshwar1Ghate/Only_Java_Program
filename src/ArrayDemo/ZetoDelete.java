package ArrayDemo;

public class ZetoDelete {

	public static void main(String[] args) {
			
		String str="50154054354";
		char []arr=str.toCharArray();
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<arr.length;i++)
		{
			if(Character.getNumericValue(arr[i])!=0)
			{
				sb.append(arr[i]);
			}
		}
				
		System.err.println(sb);
		
				

	}

}
