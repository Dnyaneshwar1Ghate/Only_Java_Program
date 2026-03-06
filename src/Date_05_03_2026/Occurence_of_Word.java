package Date_05_03_2026;

public class Occurence_of_Word {
	
	static void occWords(String str)
	{
		String [] sp=str.split(" ");
		for(int i=0;i<sp.length;i++)
		{
			int count=1;
			for(int j=i+1;j<sp.length;j++)
			{
				if(sp[i].equals(sp[j]))
				{
					count++;
					sp[j]="0";
				}
			}
			if(!sp[i].equals("0"))
			{
				System.out.println(sp[i]+":"+count);
			}
			
		}
		
	}
	public static void main(String[] args) {
	
		occWords("hello this is is is java java hello hello");
	}
}
