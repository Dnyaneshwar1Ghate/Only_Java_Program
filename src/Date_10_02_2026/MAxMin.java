package Date_10_02_2026;

public class MAxMin {

	public static void main(String[] args) {
		int num[] = { 1032, 23, 345, 547, 81, 686 };
		int max = num[0];
		int maxCount=0;
		int min = num[0];
		int minCount=0;

		for (int array : num) {
			if (array > max) {
				max = array;
			
			}
			if (array < min) {
				min = array;
				
			}

		}
		System.out.println(max+" "+min);
		
	}

}
